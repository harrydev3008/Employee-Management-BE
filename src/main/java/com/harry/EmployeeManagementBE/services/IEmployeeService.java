package com.harry.EmployeeManagementBE.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.harry.EmployeeManagementBE.model.dto.request.EmployeeInfoReq;
import com.harry.EmployeeManagementBE.model.entity.Employee;

public interface IEmployeeService {
    Employee addEmployee(EmployeeInfoReq employee);

    Employee updateEmployee(Employee employee);

    ResponseEntity<?> deleteEmployee(Long employeeId);

    List<Employee> getAllEmployees();
}
