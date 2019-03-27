package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
    private Integer Id;


    private String name;

    private Date birthDate;


    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("User [Id= %s , name= %s , birthDate= %s ]", Id, name, birthDate);
    }


    public User(Integer id, String name, Date birthDate) {
        super();
        this.Id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
}
