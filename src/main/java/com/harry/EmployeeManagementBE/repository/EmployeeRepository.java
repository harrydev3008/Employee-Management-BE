package com.harry.EmployeeManagementBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.EmployeeManagementBE.model.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    boolean existsByEmail(String email);
}