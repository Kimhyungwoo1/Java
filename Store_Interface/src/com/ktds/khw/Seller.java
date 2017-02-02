package com.ktds.khw;

public class Seller implements Sell{
	
	private StoreVo storeVo;

	public Seller(int money, int productQuantity){
		storeVo.setMoney(money);
		storeVo.setProductQuantity(productQuantity);
	}
	@Override
	public void sell() {
		storeVo.plusMoney();
		
	}

	@Override
	public void productQuantity() {
		storeVo.productQuantityMinus();
		System.out.println("감사합니다.");
		
	}

}
