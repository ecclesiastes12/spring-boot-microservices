package net.javaguides.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

/*
 * NB to use @EnableFeignClients annotation first add spring-cloud-starter-openfeign dependency together with its 
 * dependencyManagement in pom.xml file
 */


@OpenAPIDefinition(
		info = @Info(
				title = "Employee Service REST API",
				description = "Employee Service REST API's Documentation",
				version = "v1.0",
				contact = @Contact(name = "Solomon", email = "solomonotoo74@gmail.com",url = "www.ecclinks.com"),
				license = @License(name = "Apache 2.0", url = "www.ecclinks.com")
				
				
				),
		externalDocs = @ExternalDocumentation(description = "Organization-Service Doc",url = "www.ecclinks.com")
		
)



@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceApplication {
	
//	//RestTemplate configured as a spring bean
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
	
	//WebClient configured as a spring bean
	@Bean
	public WebClient webClient() {
		return WebClient.builder().build();
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
