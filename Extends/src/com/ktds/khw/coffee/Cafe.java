package com.ktds.khw.coffee;

public class Cafe {
	
	public static void main(String[] args) {
		
		CoffeeMachine espressoMachine = new CoffeeMachine();
		espressoMachine.espresso();
		
		//sub class is a super class
		System.out.println("==================라떼 머신====================");
		CoffeeMachine latteMachine = new LatteMachine();
		
		LatteMachine latte = (LatteMachine) latteMachine;
		((LatteMachine) latteMachine).latte();
		
		latteMachine.espresso();
		
		System.out.println(espressoMachine);
		System.out.println(latteMachine);
	}

}
