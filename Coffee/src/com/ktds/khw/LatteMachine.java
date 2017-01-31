package com.ktds.khw;

public class LatteMachine extends CoffeeMachine {
	
	public LatteMachine() {
		super.atm = 15;
	}
	
	@Override
	public void latte() {
		System.out.println( super.atm + "기압으로 카페라떼를 추출합니다.");
		
	}

}
