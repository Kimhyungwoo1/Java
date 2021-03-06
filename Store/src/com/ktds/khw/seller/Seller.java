package com.ktds.khw.seller;

import com.ktds.khw.buyer.Buyer;
import com.ktds.khw.vo.BasketVo;

public class Seller {

	/**
	 * 상품가격
	 */
	private final int PRICE = 2500;

	/**
	 * 판매자가 가진 금액
	 */
	private int money;

	/**
	 * 판매자가 가진 상품의 개수
	 */
	private int productQuantity;

	public Seller(int productQuantity, int money) {
		System.out.println("판매자를 생성합니다.");

		basketVo.setProductQuantity(productQuantity);
		basketVo.setMoney(money);

		System.out.println(this);

	}

	private BasketVo basketVo; 

	/**
	 * 판매하기
	 */
	public void sell(Buyer buyer) {
		if (!isSoldOut()) {
			// 판매자가 가진 상품의 개수에서 하나를 뺀다.
			basketVo.productQuantity();

			// 구매자는 돈을 지불한다.
			buyer.pay(PRICE);

			// 판매자가 가진 금액에서 상품의 가격만큼 더한다.
			basketVo.plusMoney(money);;
		}
	}

	/**
	 * 재고 파악하기
	 * 
	 * @return : boolean 재고가 있으면 false, 재고가 없으면 true
	 */
	public boolean isSoldOut() {
		boolean isSoldOut = this.productQuantity == 0;
		return isSoldOut;
	}

	@Override
	public String toString() {
		String message = String.format("판매자의 상품 개수 :%d, 판매자가 가진 금액 : %d", this.productQuantity, this.money);
		return message;
	}

}
