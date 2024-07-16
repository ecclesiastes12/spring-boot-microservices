package net.javaguides.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 *  NB without @EnableConfigServer annotation your will get error if your access the default 
 *  uri in the browser after connecting the local-git repo to the spring cloud config server
 *  
 *  This is a configuration server(config-server) and its main purpose is to provide configuration values for all
 *  the microservices(employee-service and department-service). A Git repository will be used as a backend(central repository) 
 *  for this configuration server to store configuration properties. The location of this configuration server(config-server) 
 *  will be configured in the  microservices(employee-service and department-service), so that whenever the 
 *  microservices(employee-service and department-service) are launched,
 *  it will get load configuration files from the configuration server(config-server). Much the same way launching of
 *  the spring cloud config server will also load all the configuration files from the git repository.
 *
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
