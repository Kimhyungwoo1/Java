package com.ktds.khw;

public class Main {
	
	public void start(){
		
		Buyer buyer = new Buyer(50000, 0, 0);
		KimbabHeaven heaven = new KimbabHeaven(0, 10, 10);
		
		heaven.selectManu(buyer);
		
		System.out.println(buyer);
		System.out.println(heaven);
		
	}
	
	public static void main(String[] args) {
		new Main().start();
	}

}
