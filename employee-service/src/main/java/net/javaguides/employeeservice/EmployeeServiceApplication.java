package net.javaguides.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/*
 * NB to use @EnableFeignClients annotation first add spring-cloud-starter-openfeign dependency together with its 
 * dependencyManagement in pom.xml file
 */

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
