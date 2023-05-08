package ru.shilaev.springrestapi.services;


import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.shilaev.springrestapi.dto.PersonDTO;
import ru.shilaev.springrestapi.models.Person;
import ru.shilaev.springrestapi.repositories.PeopleRepository;
import ru.shilaev.springrestapi.util.person.errors.PersonErrorResponse;
import ru.shilaev.springrestapi.util.person.errors.PersonNotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Service
@Transactional(readOnly = true)
public class PeopleService {

    private final PeopleRepository peopleRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository, ModelMapper modelMapper) {
        this.peopleRepository = peopleRepository;
        this.modelMapper = modelMapper;
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

    @Transactional
    public void update(int id, PersonDTO personDTO) {
        Person person = findById(id);

        person.setName(personDTO.getName());
        person.setAge(personDTO.getAge());
        enrichPerson(person);

        save(person);
    }

    @Transactional
    public void delete(int id) {
        peopleRepository.deleteById(id);
    }

    // UTILS
    public PersonErrorResponse makeErrorResponse(String message) {
        return new PersonErrorResponse(message, System.currentTimeMillis());
    }

    public void enrichPerson(Person person) {
        person.setCreatedAt(LocalDateTime.now());
        person.setUpdatedAt(LocalDateTime.now());
        person.setCreatedWho("ADMIN"); // get name from some logic
    }

    public Person convertToPerson(PersonDTO newPersonDTO) {
        Person person = new Person();
        modelMapper.map(newPersonDTO, person);
        enrichPerson(person);
        return person;
    }

    public PersonDTO convertToPersonDTO(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName(person.getName());
        personDTO.setAge(person.getAge());
        return personDTO;
    }

}
