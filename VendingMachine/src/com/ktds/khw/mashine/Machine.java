/**
 * 음료 3개 이상
 * 
 * 코인을 받는다 / 지정한 음료가 나온다 / 잔돈을 반환하면서 "안녕히 가세요" 멘트치기 
 */

package com.ktds.khw.mashine;

import java.util.Scanner;
import com.ktds.khw.buyer.Buyer;

public class Machine {

	Scanner input = new Scanner(System.in);
	private int colaNumber;
	private final int COLA = 1000;
	private int ciderNumber;
	private final int CIDER = 1200;
	private int fantaNumber;
	private final int FANTA = 1100;
	private int coin;
	private int buyerCoin;
	private int changes;

	
	public Machine(int coin, int colaNumber, int ciderNumber, int fantaNumber ) {
		System.out.println("머신을 생성합니다!");
		
		setColaNumber(colaNumber);
		setCiderNumber(ciderNumber);
		setFantaNumber(fantaNumber);
		setCoin(coin);
		
		System.out.println(this);
		
	}

	public void setColaNumber(int colaNumber) {
		this.colaNumber = colaNumber;
	}

	public int getColaNumber() {
		return this.colaNumber;
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

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getCoin() {
		return this.coin;
	}

	// 코인을 받는다
	public void incoin(int coin) {
		this.coin += coin;
		this.buyerCoin = coin;
	}

	// 지정한 음료가 나온다.
	public void chooseDrink() {

		System.out.println("=============================================");
		System.out.println("          어서오세요. 음료수 자판기 입니다!");
		System.out.println("콜라는 1000원, 사이다는 1200원, 환타는 1100원입니다.");
		System.out.println("=============================================");
		
		this.changes = 0;
		
		while (true) {
			
			System.out.printf("넣은돈은 %d 입니다.\n", this.buyerCoin);
			System.out.println("음료를 선택하세요 (1 : 콜라, 2: 사이다, 3:환타)");
			
			int choose = input.nextInt();
			if (choose == 1) {
				this.changes = this.buyerCoin - this.COLA;
				System.out.printf("잔돈은 %d 입니다.\n", this.changes);
				this.colaNumber--;
				break;
			} 
			
			else if (choose == 2) {
				this.changes = this.buyerCoin - this.CIDER;
				System.out.printf("잔돈은 %d 입니다.\n", this.changes);
				this.ciderNumber--;
				break;
			} 
			
			else if (choose == 3) {
				this.changes = this.buyerCoin - this.FANTA;
				System.out.printf("잔돈은 %d 입니다.\n", this.changes);
				this.fantaNumber--;
				break;
			} 
			
			else {
				System.out.println("잘못 선택하였습니다. 다시 선택해주세요 ");
			}
		}

	}
	// "안녕히가세요" 를 출력한다.
	public void bye(Buyer buyer) {
		this.coin -= changes;
		
		buyer.getItem();
		buyer.getChanges(changes);
		System.out.println("감사합니다. 안녕히가세요!");
		
	}
	
	public String toString() {
		
		String message = String.format("자판기가 가지고 있는 돈 : %d , 자판기가 가지고 있는 음료 (콜라 : %d , 사이다 : %d 환타 : %d) ",
				this.coin, this.colaNumber, this.ciderNumber, this.fantaNumber);
		return message;
	}

}
