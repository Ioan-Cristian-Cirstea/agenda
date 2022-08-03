package ro.esolutions.agenda.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ro.esolutions.agenda.services.PersonService;

@AllArgsConstructor
@Controller
@RequestMapping("/persons")
public class HomeController {
    private final PersonService personService;

    @GetMapping
    public String getAllPersons(Model model) {
        model.addAttribute("listOfPersons", personService.getAllPersonsWithPhoneNumbers());
        return "home";
    }

    @PostMapping
    public String addPerson(Model model, @RequestParam String name,
                            @RequestParam String email) {
        personService.addPerson(name, email);

        return getAllPersons(model);
    }
}
