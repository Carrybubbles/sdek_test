package ru.fedin.sdek_test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.fedin.sdek_test.dbData.DBPerson;

import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<DBPerson> getAllPersons() {
        return jdbcTemplate.query(
                "SELECT * FROM person", (rs, rowNum) -> {
                    DBPerson person = new DBPerson();
                    person.setId(rs.getInt("id"));
                    person.setName(rs.getString("name"));
                    return person;
                });
    }

    @Override
    public boolean addPerson(String personName) {
        try{
            jdbcTemplate.update("INSERT INTO person(name) VALUES(?)", personName);
            return true;
        }
        catch(org.springframework.dao.DataAccessException  e){
            return false;
        }
    }


}
