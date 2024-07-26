package net.javaguides.departmentservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RefreshScope will refresh the spring bean which is MessageController to reload configuration files
 * whenever those files are updated
 */

@RefreshScope
@RestController
public class MessageController {

	//read spring.boot.message in department-service.properties file on github
	@Value("${spring.boot.message}") 
	private String message;

	@GetMapping("message")
	public String message() {
		return message;
	}
	
	
	
}
