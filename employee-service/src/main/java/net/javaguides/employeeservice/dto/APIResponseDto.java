package net.javaguides.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * The purpose of this class is for sending api response to the client
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {

	private EmployeeDto employee;
	private DepartmentDto department;
}
