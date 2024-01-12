package com.harry.EmployeeManagementBE.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harry.EmployeeManagementBE.model.dtos.employeeDTO.EmployeeInfoReq;
import com.harry.EmployeeManagementBE.model.entity.Employee;
import com.harry.EmployeeManagementBE.services.IEmployeeService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/employees/")
@RequiredArgsConstructor
public class EmployeeRestController {

    private final IEmployeeService employeeService;

    @GetMapping("")
    public ResponseEntity<?> getAllEmployees() {
        return ResponseEntity.ok().body(employeeService.getAllEmployees());
    }

    @PostMapping("")
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeInfoReq body) {
        return ResponseEntity.ok().body(employeeService.addEmployee(body));
    }

    @PutMapping("")
    public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok().body(employeeService.updateEmployee(employee));
    }

    @DeleteMapping("{employeeId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long employeeId) {
        return ResponseEntity.ok().body(employeeService.deleteEmployee(employeeId));
    }
}