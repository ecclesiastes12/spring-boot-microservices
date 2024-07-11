package net.javaguides.employeeservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.javaguides.employeeservice.dto.DepartmentDto;



/*
 * An interface for feign client. 
 * @FeignClient takes two parameters
 * parameter 1 - base uri of the rest api client
 * parameter 2 - name for the client which can be any name of your choice
 * 
 */

@FeignClient(url="http://localhost:8080", value = "DEPARTMENT-SERVICE")//base uri
public interface APIClient {

	//method to make rest api calls. with this in place open feign library will dynamically create an implementation
	//for this interface
	//build get department REST API
	@GetMapping("api/departments/{department-code}") 
	DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
}
