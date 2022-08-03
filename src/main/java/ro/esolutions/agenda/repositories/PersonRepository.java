package ro.esolutions.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.esolutions.agenda.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
