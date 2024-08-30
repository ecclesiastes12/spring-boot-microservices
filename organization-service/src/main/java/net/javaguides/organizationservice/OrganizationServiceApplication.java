package net.javaguides.organizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
	 info = @Info(
				title = "Organization Service REST APIs",
				description = "Organization Service APIs documentation",
				version = "v1.0",
				
				contact = @Contact(
						
						name = "Solomon",
						email = "solomonotoo74@gmail.com",
						url = "ecclinks.com"
						),
	
		license = @License(
				
				name = "Apache 2.0",
				url = "www.ecclinks.com"
		)
				
		),
	 externalDocs = @ExternalDocumentation(
			 description = "Department-Service Doc",
				url = "https://www.ecclinks.com"
			)
)


@SpringBootApplication
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
