package shilaev.dbproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shilaev.dbproject.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
