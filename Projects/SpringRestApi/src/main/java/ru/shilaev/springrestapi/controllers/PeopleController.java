package ru.shilaev.springrestapi.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import ru.shilaev.springrestapi.db.dto.PersonDTO;
import ru.shilaev.springrestapi.db.models.Person;
import ru.shilaev.springrestapi.db.services.PeopleService;
import ru.shilaev.springrestapi.util.person.errors.PersonErrorResponse;
import ru.shilaev.springrestapi.util.person.errors.PersonNotCreatedException;
import ru.shilaev.springrestapi.util.person.errors.PersonNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/people/api")
public class PeopleController {

    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    // CREATE
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

        Person newPerson = peopleService.convertToPerson(newPersonDTO);
        peopleService.save(newPerson);

        return newPerson;
    }

    // READ
    @GetMapping("/all")
    public List<PersonDTO> getAllPeople() {
        return peopleService.findAll()
                .stream().map(peopleService::convertToPersonDTO)
                .collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable("id") int id) {
//        return peopleService.convertToPersonDTO(peopleService.findById(id));
        return peopleService.convertToPersonDTO(peopleService.findByIdJDBC(id));
    }

    // UPDATE
    @PatchMapping("/{id}")
    public void updatePerson(@PathVariable int id,
                             @RequestBody PersonDTO person) {
        peopleService.update(id, person);
    }

    // DELETE
    @DeleteMapping("delete/{id}")
    public void deletePerson(@PathVariable int id) {
        peopleService.delete(id);
    }

    // EXCEPTIONS
    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotFoundException e) {
        return new ResponseEntity<>(peopleService.makeErrorResponse(e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotCreatedException e) {
        return new ResponseEntity<>(peopleService.makeErrorResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
