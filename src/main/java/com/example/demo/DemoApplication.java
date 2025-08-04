package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.loose.CoffeeMaker;
import com.example.loose.DripCoffeeMachine;
import com.example.loose.EspressoMachine;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		//tight 
		//com.example.tight.CoffeeMaker coffeeMaker = new CoffeeMaker();
		//coffeeMaker.makeCoffee();
		
		//loose
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		//coffeeMaker.setCoffeeMachine(new EspressoMachine());
		//coffeeMaker.makeCoffee();
		
		coffeeMaker.setCoffeeMachine(new DripCoffeeMachine());
		coffeeMaker.makeCoffee();
		
		////
	}
}