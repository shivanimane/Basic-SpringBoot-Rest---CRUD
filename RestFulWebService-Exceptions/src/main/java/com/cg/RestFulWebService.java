/**
 * 
 */
package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Shivani
 * Apr 11, 2020
 * 
 * @SpringBootApplication annotation can be used to enable those three features :--
 * 
 * @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
 * @ComponentScan: enable @Component scan on the package where the application is located
 * @Configuration: allow to register extra beans in the context or import additional configuration classes
 * 
 * Spring Boot uses the main method so that it can be run as a Java application
 */

@SpringBootApplication
public class RestFulWebService {
	
	public static void main(String[] args) {
		SpringApplication.run(RestFulWebService.class, args);
	}
}
