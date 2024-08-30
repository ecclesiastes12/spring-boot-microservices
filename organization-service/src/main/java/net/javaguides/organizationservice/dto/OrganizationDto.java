package net.javaguides.organizationservice.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "OrganizationDto model Information")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {

	private Long id;
	
	@Schema(description = "organization name")
	private String organizationName;
	
	@Schema(description = "organization description")
	private String organizationDescription;
	
	@Schema(description = "organization code")
	private String organizationCode;
	
	@Schema(description = "created date")
	private LocalDateTime createdDate;
}
