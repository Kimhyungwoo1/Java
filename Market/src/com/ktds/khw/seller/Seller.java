package com.ktds.khw.seller;

import com.ktds.khw.buyer.Buyer;

public class Seller {

	private final int APPLE = 2500;
	private int itemNumber;
	private int money;

	public Seller(int itemNumber, int money) {
		System.out.println("판매자를 생성합니다!");

		setItemNumber(itemNumber);
		setMoney(money);

		System.out.println(this);
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getItemNumber() {
		return this.itemNumber;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return this.money;
	}

	public void sell(Buyer buyer) {

		if ( !isSoldOut() ) {
			this.itemNumber--;

			buyer.pay(APPLE);

			this.money += APPLE;
		}

	}

	public boolean isSoldOut() {
		boolean isSoldOut = this.itemNumber == 0;
		return isSoldOut;
	}

	@Override
	public String toString() {
		String message = String.format("판매자의 상품개수 : %d, 판매자가 가진 금액 : %d", this.itemNumber, this.money);
		return message;
	}

}
