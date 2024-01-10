package com.harry.EmployeeManagementBE.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class EmployeeAlreadyExistException extends RuntimeException {

    private HttpStatus httpStatus;

    public EmployeeAlreadyExistException(String message) {
        super(message);
    }

    public EmployeeAlreadyExistException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}