package ru.fedin.sdek_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fedin.sdek_test.dbData.DBPerson;
import ru.fedin.sdek_test.services.PersonService;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PersonRestController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/allPersons", method = GET)
    public List<DBPerson> getAllPersons(){
        return personService.getAllPersons();
    }
}
