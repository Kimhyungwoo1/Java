package com.ktds.khw;

public class BikeStore {

	private final int BIKEBORROWMONEY = 5000;

	private int money;
	private int bikeNumber;

	public BikeStore(int money, int bikeNumber) {
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

	public void getMoneyBike() {
		this.money += BIKEBORROWMONEY;
		
	}

	public void borrowingBike(Buyer buyer) {

		this.bikeNumber--;
		buyer.BorrowBike();
		buyer.pay(BIKEBORROWMONEY);
		getMoneyBike();

	}

	@Override
	public String toString() {

		System.out.println("==============================");
		System.out.println("       자전거 대여점 현황");
		System.out.println("==============================");
		String message = String.format("자전거 보유 수 : %d\n대여료 총합 : %d\n", this.bikeNumber, this.money);
		System.out.println("==============================");
		return message;

	}

}
