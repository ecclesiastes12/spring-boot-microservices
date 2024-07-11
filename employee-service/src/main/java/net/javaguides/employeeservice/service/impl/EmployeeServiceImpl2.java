//package net.javaguides.employeeservice.service.impl;
//
//import org.springframework.stereotype.Service;
//
//import lombok.AllArgsConstructor;
//import net.javaguides.employeeservice.dto.EmployeeDto;
//import net.javaguides.employeeservice.entity.Employee;
//import net.javaguides.employeeservice.exceptions.ResourceNotFoundException;
//import net.javaguides.employeeservice.mapper.AutoEmployeeMapper;
//import net.javaguides.employeeservice.repository.EmployeeRepository;
//import net.javaguides.employeeservice.service.EmployeeService;
//
//@Service
//@AllArgsConstructor
//public class EmployeeServiceImpl2 implements EmployeeService{
//	
//	private EmployeeRepository employeeRepository;
//	
//
//	@Override
//	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
//		
//		//convert employee dto object to employee jpa entity object
////		Employee employee = new Employee(
////				employeeDto.getId(),
////				employeeDto.getFirstName(),
////				employeeDto.getLastName(),
////				employeeDto.getEmail()
////				);
//		
//		Employee employee = AutoEmployeeMapper.MAPPER.mapTpEmployee(employeeDto);
//		
//		Employee savedEmployee = employeeRepository.save(employee);
//		
//		//convert employee entity object to employee dto object
////		EmployeeDto savedEmployeeDto = new EmployeeDto(
////				savedEmployee.getId(),
////				savedEmployee.getFirstName(),
////				savedEmployee.getLastName(),
////				savedEmployee.getEmail()
////			);
//		
//		EmployeeDto savedEmployeeDto = AutoEmployeeMapper.MAPPER.mapToEmployeeDto(savedEmployee);
//		return savedEmployeeDto;
//	}
//
//
//	@Override
//	public EmployeeDto getEmployeeById(Long employeeId) {
//		// TODO Auto-generated method stub
//		Employee employee = employeeRepository.findById(employeeId).orElseThrow(
//				//throws exception if user id is not found
//				() -> new ResourceNotFoundException("Employee", "id", employeeId)
//				
//				);
//		
////		EmployeeDto employeeDto = new EmployeeDto(
////				employee.getId(),
////				employee.getFirstName(),
////				employee.getLastName(),
////				employee.getEmail()
////				);
//		
//		EmployeeDto employeeDto = AutoEmployeeMapper.MAPPER.mapToEmployeeDto(employee);
//		
//		return employeeDto;
//	}
//
//}
