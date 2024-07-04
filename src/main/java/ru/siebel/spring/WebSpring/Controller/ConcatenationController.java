package ru.siebel.spring.WebSpring.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcatenationController {
    //Задание 4
    @PostMapping("/concatenation/{name}")
    public String concatenation(@RequestParam String id, @PathVariable String name) {
        String result = name + id;
        System.out.println(result);
        return result;
    }

    //Задание 9
    @PostMapping("/date/{date:\\d{4}-\\d{2}-\\d{2}}")
    public String regexDate(@PathVariable String date) {
        return date;
    }
}
