package net.javaguides.employeeservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;

@Mapper
public interface AutoEmployeeMapper {

	// provide the implementation of the mapping at runtime
	AutoEmployeeMapper MAPPER = Mappers.getMapper(AutoEmployeeMapper.class);
	
	
	//convert Employee JPA Entity Object to a DTO
	EmployeeDto mapToEmployeeDto(Employee employee);
	
	//convert EmployeeDto Object to a Employee JPA Entity Object
	Employee mapTpEmployee(EmployeeDto employeeDto);
}
