package com.ktds.khw;

public class Main {
	
	public void Strat(){
		
		Buyer khw = new Buyer(50000, 0);
		BikeStore bikeStore = new BikeStore(0, 100);
		
		bikeStore.borrowingBike(khw);
		
		System.out.println(khw);
		System.out.println(bikeStore);
	}
	
	public static void main(String[] args) {
		new Main().Strat();
	}

}
