package ru.fedin.sdek_test.dbData;

public class DBPerson {
    private int id = 0;
    private String name = "";

    public DBPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public DBPerson() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
