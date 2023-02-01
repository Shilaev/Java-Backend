package shilaev.testspringboot.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shilaev.testspringboot.model.Person;
import shilaev.testspringboot.repository.PersonRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PersonService {
    private final PersonRepository personRepository;
    private final JdbcTemplate jdbcTemplate;
    private final SessionFactory sessionFactory;

    @Autowired
    public PersonService(PersonRepository personRepository, JdbcTemplate jdbcTemplate, SessionFactory sessionFactory) {
        this.personRepository = personRepository;
        this.jdbcTemplate = jdbcTemplate;
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Person> getAll() {
//      return jdbcTemplate.query("select * from person", new PersonRowMapper());
//        return personRepository.findAll();
        List select_p_from_person_p = sessionFactory.getCurrentSession().createQuery("select p from Person p").getResultList();
        return select_p_from_person_p;

    }
}
