package com.example.loose;

public class CoffeeMaker {
	private CoffeMachine coffeMachine;
	
	public void setCoffeeMachine(CoffeMachine coffeMachine) {
		this.coffeMachine = coffeMachine;
	}
	
	public void makeCoffee() {
		System.out.println(coffeMachine.brew());	
	}
}