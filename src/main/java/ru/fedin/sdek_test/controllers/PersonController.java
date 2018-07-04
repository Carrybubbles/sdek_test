package ru.fedin.sdek_test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class PersonController {
    @RequestMapping(value = "/search", method = GET)
    public String showPersons() {
        return "person";
    }


}