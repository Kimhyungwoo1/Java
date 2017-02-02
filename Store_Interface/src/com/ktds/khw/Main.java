package com.ktds.khw;

public class Main {
	
	public static void main(String[] args) {
		
		Buy buyer = new Buyer(10000, 0);
		Sell seller = new Seller(0, 10);
		
		buyer.buy();
		buyer.productQuantity();
		seller.sell();
		seller.productQuantity();
	}
	
	

}
