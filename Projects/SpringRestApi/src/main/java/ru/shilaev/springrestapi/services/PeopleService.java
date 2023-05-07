package ru.shilaev.springrestapi.services;


import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.shilaev.springrestapi.models.Person;
import ru.shilaev.springrestapi.repositories.PeopleRepository;
import ru.shilaev.springrestapi.util.person.errors.PersonNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Service
@Transactional(readOnly = true)
public class PeopleService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> findAll() {
        return peopleRepository.findAll();
    }

    @SneakyThrows
    public Person findById(int id) {
        Optional<Person> foundPerson = peopleRepository.findById(id);

        Supplier<Throwable> exception = () -> new PersonNotFoundException("User with id " + id + " not found!");

        return foundPerson.orElseThrow(exception);
    }

    @Transactional
    public void save(Person newPerson) {
        peopleRepository.save(newPerson);
    }

}
