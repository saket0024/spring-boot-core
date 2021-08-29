package com.example.spring.core;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/* By default scope of bean is singleton ie only one object is created. we can change in by adding scope as prototype
 * @Scope(Value="prototype") */

@SpringBootApplication
public class SpringBootCoreApplication {
	// @Autowired
	// private Student student;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCoreApplication.class, args);
		// System.out.println("Hello from main");

		Student s = context.getBean(Student.class);
		s.doHomeWork();
		
	}

}
