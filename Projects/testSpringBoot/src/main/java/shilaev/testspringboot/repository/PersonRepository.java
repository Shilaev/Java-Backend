package shilaev.testspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import shilaev.testspringboot.model.Person;

@Transactional
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
