package com.ktds.khw.vandingmachine;

import java.util.Scanner;

public class VandingMachine {

	Scanner input = new Scanner(System.in);

	private final int COKENUMBER = 1;
	private final int CIDERNUMBER = 2;
	private final int FANTANUMBER = 3;

	private final int COKE = 1000;
	private final int CIDER = 1200;
	private final int FANTA = 900;

	private int money;
	private int cokeNumber;
	private int ciderNumber;
	private int fantaNumber;
	
	public VandingMachine(int money, int cokeNumber, int ciderNumber, int fantaNumber){
		setMoney(money);
		setCokeNumber(cokeNumber);
		setCiderNumber(ciderNumber);
		setFantaNumber(fantaNumber);
		
		System.out.println(this);
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return this.money;
	}

	public void setCokeNumber(int cokeNumber) {
		this.cokeNumber = cokeNumber;
	}

	public int getCokeNumber() {
		return this.cokeNumber;
	}

	public void setCiderNumber(int ciderNumber) {
		this.ciderNumber = ciderNumber;
	}

	public int getCiderNumber() {
		return this.ciderNumber;
	}

	public void setFantaNumber(int fantaNumber) {
		this.fantaNumber = fantaNumber;
	}

	public int getFantaNumber() {
		return this.fantaNumber;
	}

	public void inMoney(int money) {
		this.money += money;
	}

	public void chooseDrinks(int plusMoney, Buyer buyer){
		
		this.money += plusMoney;
		int chooseNumber;
		
		while(true){
			
			System.out.println("-------------------------");
			System.out.println("어서오세요! 음료수 자판기 입니다.");
			System.out.printf("원하시는 음료를 선택하세요.!\n 콜라:1, 사이다:2, 환타:3");
			
			chooseNumber = input.nextInt();
			if( chooseNumber == 1 ){
				
				if( this.cokeNumber > 0 ){
					this.cokeNumber--;
					buyer.getDrink(chooseNumber);
					break;
				}
			}
			else if( chooseNumber == 2 ){
				
				if( this.ciderNumber > 0){
					this.ciderNumber--;
					buyer.getDrink(chooseNumber);
					break;
				}
			}
			else if( chooseNumber == 3 ){
				
				if( this.fantaNumber > 0){
					this.fantaNumber--;
					buyer.getDrink(chooseNumber);
					break;
				}
			}
			else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	@Override
	public String toString(){
		String message = String.format("자판기에 남은 음료수 개수\n콜라: %d, 사이다 : %d, 환타: %d", this.cokeNumber, this.ciderNumber, this.fantaNumber);
		return message;
	}

}
