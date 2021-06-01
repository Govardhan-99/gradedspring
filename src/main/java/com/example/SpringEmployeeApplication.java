package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

// import com.example.bins.Employee;
// import com.example.bins.Teacher;

@SpringBootApplication
public class SpringEmployeeApplication {

	public static void main(String[] args) extends SpringBootServletInitializer {
		ConfigurableApplicationContext context = SpringApplication.run(SpringEmployeeApplication.class, args);
//		Employee e =context.getBean(Employee.class);
//		Teacher t=context.getBean(Teacher.class);
//		System.out.println(t.hashCode());
//		System.out.println(t.hashCode());
//		System.out.println(t.hashCode());
//		System.out.println(t.hashCode());
	}
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(SpringEmployeeApplication.class);
    }

}
