package ru.siebel.spring.WebSpring.Exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
@NoArgsConstructor
public class CustomException extends RuntimeException {
}
