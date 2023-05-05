package ru.shilaev.springrestapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shilaev.springrestapi.models.Person;
import ru.shilaev.springrestapi.services.PeopleService;

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

}
