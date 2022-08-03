package ro.esolutions.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.esolutions.agenda.entities.PhoneNumber;

import java.util.List;

@Repository
public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
    List<PhoneNumber> findAllByOwnerId(long id);
}
