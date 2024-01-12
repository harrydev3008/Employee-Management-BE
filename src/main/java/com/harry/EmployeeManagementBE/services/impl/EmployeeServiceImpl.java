package com.harry.EmployeeManagementBE.services.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.harry.EmployeeManagementBE.exception.EmployeeAlreadyExistException;
import com.harry.EmployeeManagementBE.exception.EmployeeNotFoundException;
import com.harry.EmployeeManagementBE.model.dtos.employeeDTO.EmployeeInfoReq;
import com.harry.EmployeeManagementBE.model.entity.Employee;
import com.harry.EmployeeManagementBE.repository.EmployeeRepository;
import com.harry.EmployeeManagementBE.services.IEmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(EmployeeInfoReq employee) {

        if (employeeRepository.existsByEmail(employee.getEmail()))
            throw new EmployeeAlreadyExistException("Email already exists!", HttpStatus.CONFLICT);

        Employee newEmployee = Employee.builder()
                .id(0L)
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .company(employee.getCompany())
                .education(employee.getEducation())
                .gender(employee.getGender())
                .dob(employee.getDob())
                .experiences(employee.getExperiences())
                .packages(employee.getPackages())
                .build();

        return employeeRepository.save(newEmployee);
    }

    @Override
    public ResponseEntity<?> deleteEmployee(Long employeeId) {

        if (!employeeRepository.existsById(employeeId))
            throw new EmployeeNotFoundException("Employee not exists!", HttpStatus.NOT_FOUND);

        employeeRepository.deleteById(employeeId);

        return ResponseEntity.ok().body("delete successfully!");
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
