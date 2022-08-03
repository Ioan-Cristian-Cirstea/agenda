package ro.esolutions.agenda.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.esolutions.agenda.services.PhoneNumberService;

@AllArgsConstructor
@Controller
@RequestMapping("/phoneNumber/{id}")
public class PhoneNumberController {
    private PhoneNumberService phoneNumberService;

    @GetMapping("/delete")
    public String deletePhoneNumber(@PathVariable long id) {
        phoneNumberService.deletePhoneNumberById(id);

        return "redirect:/persons";
    }
}
