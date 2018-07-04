package ru.fedin.sdek_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.fedin.sdek_test.models.Person;
import ru.fedin.sdek_test.services.PersonService;

@Controller
public class SubmitController {
    @Autowired
    private PersonService personService;

    @GetMapping("/submit")
    public String SubmitForm(Model model) {
        model.addAttribute("person", new Person());
        return "submit";
    }

    @PostMapping("/submit")
    public String Submit(@ModelAttribute Person person) {
        if(personService.addPerson(person.getName())){
            return "result";
        }
        return "error";
    }
}
