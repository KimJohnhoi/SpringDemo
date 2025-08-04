package com.example.tight;

public class CoffeeMaker {
	private DripCoffeeMachine dripCoffeeMachine;
	
	public CoffeeMaker() {
		this.dripCoffeeMachine = new DripCoffeeMachine();
	}
	
	public void makeCoffee() {
		System.out.println(dripCoffeeMachine.brew());
	}
}