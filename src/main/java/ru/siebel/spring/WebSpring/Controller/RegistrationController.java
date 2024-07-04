package ru.siebel.spring.WebSpring.Controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.siebel.spring.WebSpring.model.User;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/registration")
public class RegistrationController {
    //Задание 3
    @PostMapping
    public String registration(@RequestBody @Valid User user) {
        String result = "Registration for user " + user.getName() + " is successful!";
        System.out.println(result);
        return result;
    }
}
