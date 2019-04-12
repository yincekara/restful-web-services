package com.in28minutes.rest.webservices.restfulwebservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;


@ApiModel(description = "All the details about the user for swagger document")
public class User {
    private Integer Id;


    @Size(min=2, message = "Name should have at least 2 characters")
    @ApiModelProperty(notes="Name should have at least 2 characters." +
            "\nSecond line of information")
    private String name;

    @Past
    @ApiModelProperty(notes="Birth date cannot be in the past")
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


    protected User(){

    }

    public User(Integer id, String name, Date birthDate) {
        super();
        this.Id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
}
