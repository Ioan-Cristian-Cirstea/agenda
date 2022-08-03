package ro.esolutions.agenda.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ro.esolutions.agenda.entities.PhoneNumber;
import ro.esolutions.agenda.repositories.PhoneNumberRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Component
public class PhoneNumberService {
    private final PhoneNumberRepository phoneNumberRepository;

    public List<PhoneNumber> getAllPhoneNumberByOwnerId(long ownerId) {
        return phoneNumberRepository.findAllByOwnerId(ownerId);
    }

    public void addPhoneNumber(String number, long ownerId) {
       phoneNumberRepository.save(new PhoneNumber(number, ownerId));
    }

    public void deletePhoneNumberById(long phoneNumberId) {
        phoneNumberRepository.deleteById(phoneNumberId);
    }
}
