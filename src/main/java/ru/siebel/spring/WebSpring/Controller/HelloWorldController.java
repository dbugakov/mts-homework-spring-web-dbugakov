package ru.siebel.spring.WebSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    //Задание 1
    @GetMapping
    public String helloWorld() {
        System.out.println("Hello, World!");
        return "Hello, World!";
    }
}
