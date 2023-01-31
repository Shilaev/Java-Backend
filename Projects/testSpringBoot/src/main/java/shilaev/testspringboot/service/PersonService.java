package shilaev.testspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shilaev.testspringboot.model.Person;
import shilaev.testspringboot.model.PersonRowMapper;
import shilaev.testspringboot.repository.PersonRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class PersonService {
    private final PersonRepository personRepository;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonService(PersonRepository personRepository, JdbcTemplate jdbcTemplate) {
        this.personRepository = personRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> getAll() {
//      return jdbcTemplate.query("select * from person", new PersonRowMapper());
        return personRepository.findAll();
    }
}
