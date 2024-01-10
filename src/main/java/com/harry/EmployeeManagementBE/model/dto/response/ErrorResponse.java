package com.harry.EmployeeManagementBE.model.dto.response;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private Date timeStamp;
    private String message;
    private String error;
}
