package shilaev.dbproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import shilaev.dbproject.services.PersonService;

@Controller
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void getAllPersons() {
        System.out.println(personService.getAll());
    }

}
