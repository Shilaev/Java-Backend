package ru.shilaev.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.shilaev.models.Person;

import java.util.List;

@Component
public class PersonDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        return jdbcTemplate.query("SELECT * FROM person ORDER BY person.id;",
                new PersonRowMapper());
    }

    public Person getPersonById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person WHERE person.id = ?",
                new PersonRowMapper(), id);
    }

    public void addNewPerson(Person newPerson) {
        jdbcTemplate.update("INSERT INTO person (name, age, email) VALUES (?,?,?)",
                newPerson.getName(), newPerson.getAge(), newPerson.getEmail());

    }

    public void updatePerson(int id, Person person) {
        jdbcTemplate.update("UPDATE person " +
                        "SET name=?, age=?, email=?" +
                        "WHERE id=?",
                person.getName(), person.getAge(), person.getEmail(), id);

    }

    public void deletePerson(int id) {
        jdbcTemplate.update("DELETE FROM person WHERE person.id = ?", id);
    }

}
