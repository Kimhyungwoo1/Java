package com.ktds.khw;

import com.ktds.khw.buyer.Buyer;
import com.ktds.khw.seller.Seller;

public class Market {

	public void strat() {

		Buyer khw = new Buyer(0, 20000);
		Seller you = new Seller(10, 50000);
		
		khw.buy(you);
		
		System.out.println(khw);
		System.out.println(you);
		
	}
	
	public static void main(String[] args){
		new Market().strat();
	}

}
