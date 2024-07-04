package ru.siebel.spring.WebSpring.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.siebel.spring.WebSpring.Exception.UserNotFoundException;
import ru.siebel.spring.WebSpring.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
    //Задание 5
    @GetMapping
    public String findUser(@RequestBody User user) {
        if (!"UserName".equals(user.getName())) throw new UserNotFoundException(user.getName());
        String result = "User " + user.getName() + " found!";
        System.out.println(result);
        return result;
    }

    //Задание 6
    @GetMapping("/getUserAgent")
    public String getUserAgent(@RequestHeader("User-Agent") String userAgent) {
        return userAgent;
    }

    //Задание 5
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleException(final Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
