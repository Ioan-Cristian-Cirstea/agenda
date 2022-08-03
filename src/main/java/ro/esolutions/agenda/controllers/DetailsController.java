package ro.esolutions.agenda.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.esolutions.agenda.entities.Person;
import ro.esolutions.agenda.services.PersonService;

import java.util.Optional;

@AllArgsConstructor
@Controller
@RequestMapping("/person/{id}")
public class DetailsController {
    private final PersonService personService;

    @GetMapping
    public String getPersonDetails(Model model, @PathVariable long id){
        Optional<Person> personOptional = personService.getPersonById(id);
        if (personOptional.isEmpty())
            return "person_not_found";
        model.addAttribute("person", personOptional.get());
        return "details";
    }

    @PostMapping("/modify")
    public String changePersonDetails(@PathVariable long id,
                                      @RequestParam String name, @RequestParam String email) {
        personService.updatePerson(id, name, email);

        return "redirect:/person/" + id;
    }

    @GetMapping("/delete")
    public String deletePerson(@PathVariable long id) {
        personService.deletePersonById(id);

        return "redirect:/persons";
    }


}
