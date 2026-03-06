package com.cts.agrichain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AgrichainApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgrichainApplication.class, args);
		ApplicationContext context = SpringApplication.run(AgrichainApplication.class, args);
		System.out.println("dfghjk");
	}

}
