package ru.siebel.spring.WebSpring.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UserNotFoundException extends ResponseStatusException {
    //Задание 5
    public UserNotFoundException(String UserName) {
        super(HttpStatus.NOT_FOUND, "User " + UserName + " not found!");
    }
}
