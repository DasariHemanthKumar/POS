package com.sf.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaOrderingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaOrderingSystemApplication.class, args);
		System.out.println("I am Ready");
	}

}
