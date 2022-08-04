package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		//Auto Configure and run
		ConfigurableApplicationContext context = SpringApplication.run(SimpleApplication.class, args);
		
		//Accessing Home class -- Tight coupling -- Spring Boot avoids Tight Coupling
		//Home h = new Home();
		//h.connection();
		//Home constructor printed once in JVM Spring container -- Singleton scope project -- Bean of spring obj h and h2
		
		Home h = context.getBean(Home.class);
		h.connection();
		
		//Home constructor printed twice in JVM Spring container -- prototype scope project -- Bean of spring obj h and h2
		Home h2 = context.getBean(Home.class);
		h2.connection();
		
	}

}
