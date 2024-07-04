package ru.siebel.spring.WebSpring.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.siebel.spring.WebSpring.Exception.CustomException;

@RestController
@RequestMapping("/exception")
public class CustomExceptionController {
    //Задание 8
    @GetMapping
    public void getException() {
        throw new CustomException();
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleException(final Exception ex) throws Exception {
        throw ex;
    }
}
