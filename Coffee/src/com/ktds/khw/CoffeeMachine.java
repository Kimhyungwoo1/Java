package com.ktds.khw;

public abstract class CoffeeMachine {

	protected int atm = 9;
	
	public void espresso() {
		System.out.println(atm + "기압으로 에스프레소를 추출합니다.");
	}
	
	public abstract void latte();
	
}
