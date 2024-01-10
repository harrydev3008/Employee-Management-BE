package com.harry.EmployeeManagementBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EntityScan("com.harry.EmployeeManagementBE.model.entity")
@EnableJpaRepositories("com.harry.EmployeeManagementBE.repository")
@OpenAPIDefinition(info = @Info(title = "Employee Management", description = "Employee Management project using SpringBoot", version = "1.0", contact = @Contact(email = "chihieunguyen9a2@gmail.com", name = "Harry Nguyen")))
public class EmployeeManagementBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementBackEndApplication.class, args);
	}

}
