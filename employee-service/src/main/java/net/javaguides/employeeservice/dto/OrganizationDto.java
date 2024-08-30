package net.javaguides.employeeservice.dto;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Schema(description = "Organization Model Information for Employee Object")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {

	private Long id;
	
	@Schema(description = "Organization's Name")
	private String organizationName;
	
	@Schema(description = "Organization's Description")
	private String organizationDescription;
	
	@Schema(description = "Organization's Code")
	private String organizationCode;
	
	@Schema(description = "Date organization was created")
	private LocalDateTime createdDate;
}
