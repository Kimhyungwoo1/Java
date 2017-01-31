package com.ktds.khw.vo;

public class BasketVo {

	private int money;
	private int productQuantity;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public void productQuantity(){
		this.productQuantity--;
	}
	
	public void plusMoney(int money) {
		this.money += money;
	}

}
