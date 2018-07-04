package ru.fedin.sdek_test.services;

import ru.fedin.sdek_test.dbData.DBPerson;

import java.util.List;

public interface PersonService {
   List<DBPerson> getAllPersons();
   boolean addPerson(String personName);
}
