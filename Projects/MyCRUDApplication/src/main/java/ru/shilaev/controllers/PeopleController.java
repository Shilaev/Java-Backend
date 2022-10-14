package ru.shilaev.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.shilaev.DAO.PersonDao;
import ru.shilaev.models.Person;

import javax.validation.Valid;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDao personDao;

    @Autowired
    public PeopleController(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("personList", personDao.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String getPersonById(@PathVariable("id") int id,
                                Model model) {
        model.addAttribute("personById", personDao.getPersonById(id));
        return "people/show";
    }

    @GetMapping("/registration")
    public String registration(@ModelAttribute("newPerson") Person newPerson) {
        return "people/registration";
    }

    @PostMapping("/registration")
    public String create(@ModelAttribute("newPerson") @Valid Person newPerson, BindingResult bindingResult) {
//        Binding result - to get error messages
        if (bindingResult.hasErrors())
            return "people/registration";

        personDao.addNewPerson(newPerson);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("personById", personDao.getPersonById(id));
        return "people/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("personById") @Valid Person person, BindingResult bindingResult,
                         @PathVariable("id") int id) {
        if (bindingResult.hasErrors())
            return "people/edit";

        personDao.updatePerson(id, person);
        return "redirect:/people";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        personDao.deletePerson(id);
        return "redirect:/people";
    }
}
