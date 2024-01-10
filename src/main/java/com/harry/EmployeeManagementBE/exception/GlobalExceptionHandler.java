package com.harry.EmployeeManagementBE.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeAlreadyExistException.class)
    public ResponseEntity<?> EmployeeAlreadyExistException(EmployeeAlreadyExistException exc) {

        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("error_message", exc.getLocalizedMessage());
        errorResponse.put("error_code", exc.getHttpStatus().value());

        return ResponseEntity.status(exc.getHttpStatus().value()).body(errorResponse);
    }
}