package com.ktds.khw;

import com.ktds.khw.buyer.Buyer;
import com.ktds.khw.seller.Seller;


public class Store {

	public void start() {

		/*
		 * Buyer khw = new Buyer(0, 5000000); Buyer you = khw;
		 * 
		 * khw.buy();
		 * 
		 * System.out.println(khw); System.out.println(you);
		 */

		Buyer khw = new Buyer(0, 50000);
		Seller you = new Seller(10, 50000);
		
		khw.buy(you);
		
		System.out.println(khw);
		System.out.println(you);

		/*
		 * System.out.println("장터에 오신것을 환영합니다 !"); Buyer khw = new Buyer(0,
		 * 5000000); Seller you = new Seller(100, 50000000);
		 * 
		 * System.out.println("바이어 : 상품 좀 살께요. 이 상품 한개 주세요."); you.sell();
		 * khw.buy();
		 * 
		 * System.out.println("셀러 : 2500원 입니다."); khw.pay(2500);
		 * 
		 * System.out.println(khw); System.out.println(you);
		 */
	}

	// 앞으로 메인클래스를 쓰는 방법
	public static void main(String[] args) {
		new Store().start();
	}

}
