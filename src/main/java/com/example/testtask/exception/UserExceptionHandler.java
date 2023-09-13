package com.example.testtask.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //контроллер для управления ошибками (exceptions)
public class UserExceptionHandler {
    @ExceptionHandler(value = {UserNotFoundException.class})
    public UserException handleUserNotFoundException(UserNotFoundException userNotFoundException){
        UserException userException = new UserException(userNotFoundException.getMessage(),
                userNotFoundException.getCause(),
                HttpStatus.NOT_FOUND);
        return userException;
    }
}
