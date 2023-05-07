package ru.shilaev.springrestapi.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import ru.shilaev.springrestapi.models.Person;
import ru.shilaev.springrestapi.services.PeopleService;
import ru.shilaev.springrestapi.util.person.errors.PersonErrorResponse;
import ru.shilaev.springrestapi.util.person.errors.PersonNotCreatedException;
import ru.shilaev.springrestapi.util.person.errors.PersonNotFoundException;

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
    public Person create(@RequestBody @Valid Person newPerson,
                         BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            StringBuilder errorResponse = new StringBuilder();

            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError er : errors) {
                errorResponse.append(er.getField())
                        .append(" : ").append(er.getDefaultMessage())
                        .append(";\n");
            }

            throw new PersonNotCreatedException(errorResponse.toString());
        }

        peopleService.save(newPerson);

        return newPerson;
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotFoundException e) {
        return new ResponseEntity<>(
                MakeErrorResponse(e.getMessage()),
                HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotCreatedException e) {
        return new ResponseEntity<>(
                MakeErrorResponse(e.getMessage()),
                HttpStatus.BAD_REQUEST
        );
    }

    private PersonErrorResponse MakeErrorResponse(String message) {
        return new PersonErrorResponse(message, System.currentTimeMillis());
    }
}
