package shilaev.testspringboot.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import shilaev.testspringboot.model.Person;
import shilaev.testspringboot.service.PersonService;

@Controller
@RequestMapping("person")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String getAll() {
        personService.getAll().forEach(person -> System.out.println(person.getName()));
        return "person_list";
    }
}
