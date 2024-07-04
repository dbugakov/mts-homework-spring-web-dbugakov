package ru.siebel.spring.WebSpring.Controller;

import org.springframework.web.bind.annotation.*;
import ru.siebel.spring.WebSpring.model.Greetings;

@RestController
@RequestMapping("/greet")
public class GreetingsController {
    //Задание 2
    @PostMapping("/greetings")
    public String sendGreetings(@RequestBody Greetings greetings) {
        String result = "Greetings, " + greetings.getName() + "!";
        System.out.println(result);
        return result;
    }

    //Задание 10
    @PostMapping("/greetingsWithRequestParam")
    public String sendGreetingsWithRequestParam(@RequestParam(defaultValue = "Guest") String name) {
        String result = "Greetings, " + name + "!";
        System.out.println(result);
        return result;
    }
}
