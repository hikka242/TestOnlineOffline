package com.example.testtask.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@Data //getter and setter
public class UserException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}
