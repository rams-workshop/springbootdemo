package springbootdemo;

import com.rams.workshop.dependencyinjection.AlienWithDI;
import com.rams.workshop.dependencyinjection.AlienWithoutDI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
		System.out.printf("Hello World! This is a Spring Boot application.");
	}

}
