package ru.shilaev.springrestapi.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import ru.shilaev.springrestapi.dto.PersonDTO;
import ru.shilaev.springrestapi.models.Person;
import ru.shilaev.springrestapi.services.PeopleService;
import ru.shilaev.springrestapi.util.person.errors.PersonErrorResponse;
import ru.shilaev.springrestapi.util.person.errors.PersonNotCreatedException;
import ru.shilaev.springrestapi.util.person.errors.PersonNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/people/api")
public class PeopleController {

    private final PeopleService peopleService;
    private final ModelMapper modelMapper;

    @Autowired
    public PeopleController(PeopleService peopleService, ModelMapper modelMapper) {
        this.peopleService = peopleService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/all")
    public List<PersonDTO> getAllPeople() {
        return peopleService.findAll()
                .stream().map(this::convertToPersonDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable("id") int id) {
        return convertToPersonDTO(peopleService.findById(id));
    }

    @PostMapping()
    public Person create(@RequestBody @Valid PersonDTO newPersonDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            StringBuilder errorResponse = new StringBuilder();

            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError er : errors) {
                errorResponse.append(er.getField()).append(" : ").append(er.getDefaultMessage()).append(";\n");
            }

            throw new PersonNotCreatedException(errorResponse.toString());
        }

        Person newPerson = convertToPerson(newPersonDTO);
        peopleService.save(newPerson);

        return newPerson;
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotFoundException e) {
        return new ResponseEntity<>(peopleService.makeErrorResponse(e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotCreatedException e) {
        return new ResponseEntity<>(peopleService.makeErrorResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    private Person convertToPerson(PersonDTO newPersonDTO) {
        Person person = new Person();
        modelMapper.map(newPersonDTO, person);
        peopleService.enrichPerson(person);
        return person;
    }

    private PersonDTO convertToPersonDTO(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName(person.getName());
        personDTO.setAge(person.getAge());
        return personDTO;
    }
}
