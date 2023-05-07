package ru.shilaev.springrestapi.controllers;

import jakarta.validation.Valid;
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

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/people/api")
public class PeopleController {

    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/all")
    public List<Person> getAllPeople() {
        return peopleService.findAll(); // JACKSON converts json automatically
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return peopleService.findById(id);
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

    private Person convertToPerson(PersonDTO newPersonDTO) {
        Person person = new Person();
        person.setName(newPersonDTO.getName());
        person.setAge(newPersonDTO.getAge());

        enrichPerson(person);

        return person;
    }

    private void enrichPerson(Person person) {
        person.setCreatedAt(LocalDateTime.now());
        person.setUpdatedAt(LocalDateTime.now());
        person.setCreatedWho("ADMIN"); // get name from some logic
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotFoundException e) {
        return new ResponseEntity<>(makeErrorResponse(e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotCreatedException e) {
        return new ResponseEntity<>(makeErrorResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    private PersonErrorResponse makeErrorResponse(String message) {
        return new PersonErrorResponse(message, System.currentTimeMillis());
    }
}
