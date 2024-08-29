package net.javaguides.departmentservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

//define general api information with annotations
@OpenAPIDefinition(
		info = @Info(
				title = "Department Service REST APIs",
				description = "Department Service REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Solomon",
						email = "solomonotoo74@gmail.com",
						url = "https://www.ecclinks.com"
				),
				
				license = @License(
						name = "Apache 2.0",
						url = "https://www.ecclinks.com"
				)
		),
		
		externalDocs = @ExternalDocumentation(
				description = "Department-Service Doc",
				url = "https://www.ecclinks.com"
		)
		
)

@SpringBootApplication
public class DepartmentServiceApplication {
	
	@Bean  //bean for mapping or converting data from jpa entity to dtos and vice versa
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
