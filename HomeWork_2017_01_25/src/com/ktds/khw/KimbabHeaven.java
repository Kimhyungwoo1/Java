package com.ktds.khw;

import java.util.Scanner;

public class KimbabHeaven {

	Scanner input = new Scanner(System.in);

	private final int KIMBOB = 3500;
	private final int MEATBOWL = 6500;
	
	/*private int kimbobTotal = 0;
	private int meatBowlTotal = 0;*/
	private int total;

	private int money;
	private int kimBab;
	private int meatBowl;

	public KimbabHeaven(int money, int kimBab, int meatBowl) {
		this.money = money;
		this.kimBab = kimBab;
		this.meatBowl = meatBowl;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getKimBab() {
		return kimBab;
	}

	public void setKimBab(int kimBab) {
		this.kimBab = kimBab;
	}

	public int getMeatBowl() {
		return meatBowl;
	}

	public void setMeatBowl(int meatBowl) {
		meatBowl = meatBowl;
	}

	public void moneyGet(int money) {
		this.money += money;
	}

	public void selectManu(Buyer buyer) {

		int buyerSelect = 0;
		
		int kimbobTotal = this.money;
		int meatBowlTotal = this.money;
		
		while (true) {

			System.out.println("=====================================");
			System.out.println("        김밥천국 메뉴");
			System.out.println("     김밥 : 1 , 제육덥밥 : 2  종료 : 999");
			System.out.println("=====================================");
			buyerSelect = buyer.selectMenu();
			
			if (buyerSelect == 1) {
				if (this.kimBab > 0) {
					//System.out.println("-------------------------------------");
					System.out.println(" 3500원 입니다.");
					//System.out.println("-------------------------------------");
					kimBab--;
					kimbobTotal += this.KIMBOB;
					buyer.pay(KIMBOB);
					buyer.countMenu(buyerSelect);
				}
				else{
					System.out.println("김밥이 없습니다. 다른메뉴를 선택해 주세요!");
				}
			} 
			else if (buyerSelect == 2) {
				if (this.meatBowl > 0) {
					//System.out.println("-------------------------------------");
					System.out.println(" 6500원 입니다.");
					//System.out.println("-------------------------------------");
					meatBowl--;
					meatBowlTotal += this.MEATBOWL;
					buyer.pay(MEATBOWL);
					buyer.countMenu(buyerSelect);
				}
				else{
					System.out.println("제육볶음이 없습니다. 다른메뉴를 선택해 주세요!");
				}
			} 
			else if (buyerSelect == 999) {
				this.total = kimbobTotal + meatBowlTotal;
				System.out.printf("총 내실 금액은 %d 입니다!", total);
				System.out.println(" 안녕히가세요! ");
				break;
			} 
			else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.!");
			}
		}

	}

	@Override
	public String toString() {

		String message = String.format("총 수익 : %d , 오늘 나간 김밥 수 : %d, 오늘 나간 제육덥밥 수 : %d ", this.total, this.kimBab,
				this.meatBowl);
		return message;
	}

}
