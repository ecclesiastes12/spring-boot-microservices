package net.javaguides.departmentservice.mapper;

import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;

/*
 * NB The purpose of this class is to convert DepartmentDTO to JPA Entity Object and vice versa
 */
public class DepartmentMapper {
	
	public static DepartmentDto mapToDepartmentDto(Department department) {
		DepartmentDto departmentDto = new DepartmentDto(
		department.getId(),
		department.getDepartmentName(),
		department.getDepartmentDescription(),
		department.getDepartmentCode()
		);
		
		return departmentDto;
	}
	
	
	public static Department mapToDepartment(DepartmentDto departmentDto) {
		Department department = new Department(
				departmentDto.getId(),
				departmentDto.getDepartmentName(),
				departmentDto.getDepartmentDescription(),
				departmentDto.getDepartmentCode()
			
		);
		
		return department;
	}

}
