package ru.shilaev.springrestapi.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.shilaev.springrestapi.db.dao.mappers.PersonRowMapper;
import ru.shilaev.springrestapi.db.models.Person;

import java.util.Optional;

@Component
public class PersonDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Optional<Person> get(int id) {
        String selectById = "select *\n" +
                "from person\n" +
                "where id = ?;";
        return Optional.ofNullable(
                jdbcTemplate.queryForObject(selectById, new PersonRowMapper(), id)
        );
    }

    public void updateAll(){
//        jdbcTemplate.batchUpdate()
    }
}
