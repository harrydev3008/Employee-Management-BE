package com.harry.EmployeeManagementBE.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class EmployeeNotFoundException extends RuntimeException {
    
    private HttpStatus httpStatus;

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, HttpStatus status) {
        super(message);
        this.httpStatus = status;
    }
}