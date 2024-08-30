package net.javaguides.employeeservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.javaguides.employeeservice.dto.APIResponseDto;
import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;
import net.javaguides.employeeservice.service.EmployeeService;

/*
 * check EmployeeController2.java for the previous before the implementation of RestTemplate
 */

@Tag(name = "Employee Service - EmployeeController",description = "Employee Controller Exposes REST APIs for Employee-Service")

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

	private EmployeeService employeeService;
	
	@Operation(summary = "Save Employee Service REST API", description = "Save Employee REST API is used to save employee object into a databas")
	@ApiResponse(responseCode = "201", description = "HTTP Status 201 CREATED")
	
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
	
	@Operation(summary = "Get Employee Service REST API", description = "Get Employee REST API is used to retrieve employee object into a databas")
	@ApiResponse(responseCode = "200", description = "HTTP Status 200 SUCCESS")
	
	
	//code modified after RestTemplate implementation in the EmployeeServiceImpl.java class
		//and EmployeeDto is now changed to APIResponseDto
	@GetMapping("{id}")
	public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId){
		APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
		
		return new ResponseEntity<APIResponseDto>(apiResponseDto, HttpStatus.OK);
	}
	
	
}
