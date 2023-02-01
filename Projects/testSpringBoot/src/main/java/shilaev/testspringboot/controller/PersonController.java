package shilaev.testspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import shilaev.testspringboot.service.PersonService;

@Controller
@RequestMapping("person")
@PropertySource("classpath:custom.properties")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @Value("hello")
    private String hello;

    @GetMapping
    public String getAll() {
        personService.getAll().forEach(person -> System.out.println(person.getName()));
        System.out.println(hello);
        return "person_list";
    }
}
