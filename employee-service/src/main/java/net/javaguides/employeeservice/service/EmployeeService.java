package net.javaguides.employeeservice.service;

import net.javaguides.employeeservice.dto.APIResponseDto;
import net.javaguides.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	
	//EmployeeDto getEmployeeById(Long employeeId);
	
	//NB EmployeeDto change to APIResponseDto because of the implementation of RestTemplate
	APIResponseDto getEmployeeById(Long employeeId);
}
