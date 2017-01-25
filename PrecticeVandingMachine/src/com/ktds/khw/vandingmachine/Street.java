package com.ktds.khw.vandingmachine;

public class Street {

	public void start() {

		Buyer khw = new Buyer(10000);
		VandingMachine you = new VandingMachine(1000, 10, 10, 10);
		
		khw.buy(outputMoney);
	}

	public static void main(String[] args) {
		new Street().start();
	}

}
