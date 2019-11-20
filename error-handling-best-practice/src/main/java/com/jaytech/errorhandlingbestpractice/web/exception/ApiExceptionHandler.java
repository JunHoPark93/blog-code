package com.jaytech.errorhandlingbestpractice.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleException(BookNotFoundException ex) {
        ApiErrorResponse response =
                new ApiErrorResponse("error-0001", "No book is found with ID : " + ex.getId());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
