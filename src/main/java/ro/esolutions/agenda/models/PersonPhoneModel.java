package ro.esolutions.agenda.models;

import ro.esolutions.agenda.entities.Person;
import ro.esolutions.agenda.entities.PhoneNumber;

import java.util.List;

public record PersonPhoneModel(Person person, List<PhoneNumber> phoneNumbers) {
}
