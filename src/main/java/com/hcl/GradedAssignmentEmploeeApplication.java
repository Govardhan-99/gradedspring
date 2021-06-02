package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
@SpringBootApplication
public class GradedAssignmentEmploeeApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(GradedAssignmentEmploeeApplication.class, args);
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(GradedAssignmentEmploeeApplication.class);
    }
}