package com.ktds.khw.buyer;

import com.ktds.khw.seller.Seller;

public class Buyer {
	
	private int money;
	private int itemNumber;
	
	public Buyer(int itemNumber, int money){
		System.out.println("구매자를 생성합니다!");
		
		setItemNumbet(itemNumber);
		setMoney(money);
		
		//현재 상황 출력
		System.out.println(this);
		
	}
	
	public void setMoney( int money ){
		this.money = money;
	}
	public int getMoney() {
		return this.money;
	}
	
	public void setItemNumbet ( int itemNumber ) {
		this.itemNumber = itemNumber;
	}
	public int getItemNumber (){
		return this.itemNumber;
	}
	
	public void buy(Seller seller) {
		
		seller.sell(this);
		
		this.itemNumber++;
		
	}
	
	public void pay(int money) {
		this.money -= money;
	}
	
	@Override
	public String toString() {
		String message = String.format("구매한 상품의 개수 : %d, 남은 잔돈 : %d", this.itemNumber, this.money);
		
		return message;
	}

}
