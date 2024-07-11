package net.javaguides.employeeservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.javaguides.employeeservice.dto.APIResponseDto;
import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;
import net.javaguides.employeeservice.service.EmployeeService;

/*
 * check EmployeeController2.java for the previous before the implementation of RestTemplate
 */

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

	private EmployeeService employeeService;
	
	
	//Build Saved Employee REST API
	@PostMapping
	public ResponseEntity<EmployeeDto> savedEmployee(@RequestBody EmployeeDto employeeDto){
		EmployeeDto savedEmployeeDto = employeeService.saveEmployee(employeeDto);
		
		return new ResponseEntity<EmployeeDto>(savedEmployeeDto, HttpStatus.CREATED);
	}
	
	//Build get Employee REST API
//	@Deprecated
//	@GetMapping("{id}")
//	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long employeeId){
//		EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
//		
//		return new ResponseEntity<EmployeeDto>(employeeDto, HttpStatus.OK);
//	}
	
	//code modified after RestTemplate implementation in the EmployeeServiceImpl.java class
		//and EmployeeDto is now changed to APIResponseDto
	@GetMapping("{id}")
	public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId){
		APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
		
		return new ResponseEntity<APIResponseDto>(apiResponseDto, HttpStatus.OK);
	}
	
	
}
