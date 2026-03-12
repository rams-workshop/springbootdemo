package com.rams.workshop.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemo {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionDemo.class, args);

        //this is just to show that we can create an object without using Spring's Dependency Injection (DI) mechanism.
		AlienWithoutDI alienWithoutDI = new AlienWithoutDI();
		alienWithoutDI.code();

		//This is how we would get a bean from the Spring context. This would work if AlienWithoutDI was annotated with @Component or if it was defined as a bean in a configuration class. Since it's not, this line would throw an exception if uncommented.
		//context.getBean(AlienWithoutDI.class);

		//This is how we would get a bean from the Spring context. This works because AlienWithDI is annotated with @Component, so Spring will automatically detect it and create a bean for it.
		var alientWithDI = context.getBean(AlienWithDI.class);
		alientWithDI.code();

		System.out.printf("Hello World! This is a Spring Boot DI Example.");
	}

}
