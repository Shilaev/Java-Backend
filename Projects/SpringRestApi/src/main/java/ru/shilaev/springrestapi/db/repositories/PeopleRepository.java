package ru.shilaev.springrestapi.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shilaev.springrestapi.db.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
