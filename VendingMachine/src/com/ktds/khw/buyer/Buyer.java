/**
 * 자판기에서 뽑아 먹는 사람 
 * 돈, 뽑은 음료
 * 돈을 넣는다 / 음료를 꺼낸다 / 음료를 마신다
 */
package com.ktds.khw.buyer;

import com.ktds.khw.mashine.Machine;

public class Buyer {

	private int itemNumber;
	private int coin;
	private int changes;
	private final String drink = "꿀꺽꿀꺽";
	
	public Buyer(int coin, int itemNumber) {
		System.out.println("사용자를 생성합니다!");
		
		setCoin(coin);
		setItemNumber(itemNumber);
		
		System.out.println(this);
		
	}


	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getItemNumber() {
		return this.getItemNumber();
	}
	
	public void setCoin(int coin){
		this.coin = coin;
	}
	
	public int getCoin(){
		return this.coin;
	}
	
	//돈을 넣는다.
	public void inCoin(Machine machine) {
		machine.incoin(this.coin);
		this.coin = 0;
		
		
	}
	
	public void getItem(){
		this.itemNumber++;
	}
	
	public void getChanges(int changes){
		this.changes = changes;
		//System.out.println(this.changes);
	}
	
	public void drinkItem() {
		System.out.println(drink);
	}
	
	@Override
	public String toString() {
		
		String message = String.format("구매자가 가진 돈 : %d , 구매자가 가진 음료개수 : %d ", this.changes, this.itemNumber);
		return message;
	}

}

















