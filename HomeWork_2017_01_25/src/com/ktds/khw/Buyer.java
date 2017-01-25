package com.ktds.khw;

import java.util.Scanner;

public class Buyer {

	Scanner input = new Scanner(System.in);

	private int money;
	private int menuSelectKimbob;
	private int menuSelectMeatBowl;

	
	
	public Buyer(int money, int menuSelectKimbob, int menuSelectMeatBowl) {
		this.money = money;
		this.menuSelectKimbob = menuSelectKimbob;
		this.menuSelectMeatBowl = menuSelectMeatBowl;
	}

	public int getMenuSelectKimbob() {
		return menuSelectKimbob;
	}

	public void setMenuSelectKimbob(int menuSelectKimbob) {
		this.menuSelectKimbob = menuSelectKimbob;
	}

	public int getMenuSelectMeatBowl() {
		return menuSelectMeatBowl;
	}

	public void setMenuSelectMeatBowl(int menuSelectMeatBowl) {
		this.menuSelectMeatBowl = menuSelectMeatBowl;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void pay(int money) {
		this.money -= money;
	}

	public int selectMenu() {
		int selectMenus = input.nextInt();
		return selectMenus;

	}
	
	public void countMenu(int count){
		if(count == 1){
			menuSelectKimbob++;
		}
		else if(count == 2){
			menuSelectMeatBowl++;
		}
		
	}

	@Override
	public String toString() {
		
		String message = String.format("먹은 깁밥 수 : %d , 먹은 제육덥밥 수 : %d 남은 돈 : %d", this.menuSelectKimbob, this.menuSelectMeatBowl, this.money);
		return message;
		
	}

}
