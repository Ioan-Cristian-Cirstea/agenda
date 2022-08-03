package ro.esolutions.agenda.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ro.esolutions.agenda.entities.Person;
import ro.esolutions.agenda.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Component
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(long id) {
        return personRepository.findById(id);
    }

    public void deletePersonById(long id) {
        personRepository.deleteById(id);
    }

    public void updatePerson(long id, String name, String email) {
        Optional<Person> personOptional = personRepository.findById(id);
        if (personOptional.isEmpty())
            return;
        Person person = personOptional.get();
        if (!name.equals(""))
            person.setName(name);
        if (!email.equals(""))
            person.setEmail(email);
        personRepository.save(person);
    }

    public void addPerson(String name, String email) {
        Person person = new Person(name, email);
        personRepository.save(person);
    }
}
