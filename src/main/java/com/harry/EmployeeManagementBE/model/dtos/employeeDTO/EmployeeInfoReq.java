package com.harry.EmployeeManagementBE.model.dtos.employeeDTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeInfoReq {
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;
    private String gender;
    private String education;
    private String company;
    private int experiences;
    private int packages;
}
