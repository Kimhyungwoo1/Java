package com.ktds.khw;

public class Buyer {

	private int money;
	private int bikeNumber;

	public Buyer(int money, int bikeNumber) {
		this.money = money;
		this.bikeNumber = bikeNumber;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(int bikeNumber) {
		this.bikeNumber = bikeNumber;
	}
	
	public void pay(int money ){
		this.money -= money;
		
	}
	
	public void BorrowBike(){
		this.bikeNumber++;
	}
	
	@Override
	public String toString(){
		
		System.out.println("==============================");
		System.out.println("          대여자 현황");
		System.out.println("==============================");
		String message = String.format("자전거 보유 수 : %d대\n대여료 총 합 : %d\n", this.bikeNumber, this.money);
		System.out.println("==============================");
		return message;
	}

}
