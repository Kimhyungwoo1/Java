package com.ktds.khw.vandingmachine;

import java.util.Scanner;

public class Buyer {
	
	Scanner input = new Scanner(System.in);
	
	private int money;
	private int cokeNumber;
	private int ciderNumber;
	private int fantaNumber;
	
	public Buyer(int money){
		setMoney(money);
		
		System.out.println(this);
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	
	public int getMoney(){
		return this.money; 
	}
	
	public void setCokeNumber(int cokeNumber){
		this.cokeNumber = cokeNumber;
	}
	
	public int getCokeNumber(){
		return this.cokeNumber;
	}
	
	public void setCiderNumber(int ciderNumber) {
		this.ciderNumber = ciderNumber;
	}
	
	public int getCiderNumber(){
		return this.ciderNumber;
	}
	
	public void setFantaNumber(int fantaNumber){
		this.fantaNumber = fantaNumber;
	}
	
	public int getFantaNumber(){
		return this.fantaNumber;
	}
	
	public void buy(int outputMoney) {
		this.money -= outputMoney;
	}
	
	public void getDrink(int chooseNumber) {
		
		if( chooseNumber == 1 ){
			this.cokeNumber++;
		}
		else if( chooseNumber == 2 ){
			this.ciderNumber++;
		}
		else if( chooseNumber == 3 ){
			this.fantaNumber++;
		}
	}
	
	public void chooseMenu(){
		int chooseMenu = input.nextInt();
		
	}
	
	@Override
	public String toString(){
		String message = String.format("구매자의 음료 개수 : 콜라=%d, 사이다=%d, 환타=%d, 남은돈 : %d\n", this.cokeNumber, this.ciderNumber, this.fantaNumber, this.money);
		return message;
	}

}
