package org.example;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// Configures the application to run in a servlet container (e.g., Tomcat)
public class ServletInitializer extends SpringBootServletInitializer {

	// Overrides the configure method to link the Main class as the application's entry point
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Main.class); // Specifies the main application class
	}
}
