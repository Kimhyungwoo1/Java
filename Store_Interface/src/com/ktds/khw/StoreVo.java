package com.ktds.khw;

public class StoreVo {

	private int money;
	private int productQuantity;
	
	private final int FOX = 2500;

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
	
	public void plusMoney(){
		this.money = money + FOX; 
	}
	
	public void productQuantityPlus() {
		this.productQuantity++;
	}
	
	public void minusMoney(){
		this.money = money - FOX;
	}
	
	public void productQuantityMinus(){
		this.productQuantity--;
	}
	
	/*public String toString(){
		String message = String.format("", args)
	}*/

}
