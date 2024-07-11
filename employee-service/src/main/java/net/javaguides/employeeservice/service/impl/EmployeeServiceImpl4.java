//package net.javaguides.employeeservice.service.impl;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import lombok.AllArgsConstructor;
//import net.javaguides.employeeservice.dto.APIResponseDto;
//import net.javaguides.employeeservice.dto.DepartmentDto;
//import net.javaguides.employeeservice.dto.EmployeeDto;
//import net.javaguides.employeeservice.entity.Employee;
//import net.javaguides.employeeservice.exceptions.ResourceNotFoundException;
//import net.javaguides.employeeservice.mapper.AutoEmployeeMapper;
//import net.javaguides.employeeservice.repository.EmployeeRepository;
//import net.javaguides.employeeservice.service.EmployeeService;
//
//
///*
// *Code refactor with WebClient. see  EmployeeServiceImpl2.java for the previous code and EmployeeServiceImpl3.java for RestTemplate implementation
// */
//
//@Service
//@AllArgsConstructor
//public class EmployeeServiceImpl4 implements EmployeeService{
//	
//	private EmployeeRepository employeeRepository;
//	
//	//private RestTemplate restTemplate;
//	
//	private WebClient webClient;
//	
//
//	@Override
//	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
//		
//		//convert employee dto object to employee jpa entity object
//		Employee employee = new Employee(
//				employeeDto.getId(),
//				employeeDto.getFirstName(),
//				employeeDto.getLastName(),
//				employeeDto.getEmail(),
//				employeeDto.getDepartmentCode()
//				);
//		
//		//Employee employee = AutoEmployeeMapper.MAPPER.mapTpEmployee(employeeDto);
//		
//		Employee savedEmployee = employeeRepository.save(employee);
//		
//		//convert employee entity object to employee dto object
//		EmployeeDto savedEmployeeDto = new EmployeeDto(
//				savedEmployee.getId(),
//				savedEmployee.getFirstName(),
//				savedEmployee.getLastName(),
//				savedEmployee.getEmail(),
//				savedEmployee.getDepartmentCode()
//			);
//		
//		//EmployeeDto savedEmployeeDto = AutoEmployeeMapper.MAPPER.mapToEmployeeDto(savedEmployee);
//		return savedEmployeeDto;
//	}
//
//
////	@Override
////	@Deprecated  //pubilc access type removed
////	 EmployeeDto getEmployeeById(Long employeeId) {
////		// TODO Auto-generated method stub
////		Employee employee = employeeRepository.findById(employeeId).orElseThrow(
////				//throws exception if user id is not found
////				() -> new ResourceNotFoundException("Employee", "id", employeeId)
////				
////				);
////		
////		EmployeeDto employeeDto = new EmployeeDto(
////				employee.getId(),
////				employee.getFirstName(),
////				employee.getLastName(),
////				employee.getEmail(),
////				employee.getDepartmentCode()
////				);
////		
////		//EmployeeDto employeeDto = AutoEmployeeMapper.MAPPER.mapToEmployeeDto(employee);
////		
////		return employeeDto;
////	}
//	
//	//NB for learning purpose the exception part is removed and the return type change from EmployeeDto to APIResponseDto
//	@Override
//	public APIResponseDto getEmployeeById(Long employeeId) {
//		// TODO Auto-generated method stub
////		Employee employee = employeeRepository.findById(employeeId).orElseThrow(
////				//throws exception if user id is not found
////				() -> new ResourceNotFoundException("Employee", "id", employeeId)
////				);
//		
//		Employee employee = employeeRepository.findById(employeeId).get();
//		
//		/*
//		 * see EmployeeServiceImpl3.java for how RestTemplate implementation to achieve the same result
//		 * 
//		 * Make rest api call using web client to get employee base on department
//		 */
//		
//		DepartmentDto departmentDto = webClient.get()
//				.uri("http://localhost:8080/api/departments/" + employee.getDepartmentCode())
//				.retrieve() //retrieve method from webclient
//				.bodyToMono(DepartmentDto.class) //pass in response type
//				.block(); //asynchronous type
//		
//		
//		EmployeeDto employeeDto = new EmployeeDto(
//				employee.getId(),
//				employee.getFirstName(),
//				employee.getLastName(),
//				employee.getEmail(),
//				employee.getDepartmentCode()
//				);
//		
//		//EmployeeDto employeeDto = AutoEmployeeMapper.MAPPER.mapToEmployeeDto(employee);
//		
//		//create api response object
//		APIResponseDto apiResponseDto = new APIResponseDto();
//		
//		//set employee and department response to be send to the client
//		apiResponseDto.setEmployee(employeeDto);
//		apiResponseDto.setDepartment(departmentDto);
//		
//		return apiResponseDto;
//	}
//
//}
