// Defines the package for this class
package org.example;

// Required Spring Boot and REST components
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

// Marks this as the main Spring Boot application and REST controller
@SpringBootApplication
@RestController
public class Main {

	// Main method to start the application
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
