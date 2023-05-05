package ru.shilaev.springrestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shilaev.springrestapi.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
