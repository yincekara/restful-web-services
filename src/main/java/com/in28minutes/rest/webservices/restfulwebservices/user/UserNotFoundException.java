package com.in28minutes.rest.webservices.restfulwebservices.user;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
