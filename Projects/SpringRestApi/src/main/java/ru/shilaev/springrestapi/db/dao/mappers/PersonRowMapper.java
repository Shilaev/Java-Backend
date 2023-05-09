package ru.shilaev.springrestapi.db.dao.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.shilaev.springrestapi.db.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setAge(rs.getInt("age"));
        person.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        person.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        person.setCreatedWho(rs.getString("created_who"));
        return person;
    }
}
