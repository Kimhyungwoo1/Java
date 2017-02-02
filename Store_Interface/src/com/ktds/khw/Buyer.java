package com.ktds.khw;

import com.ktds.khw.StoreVo;


public class Buyer implements Buy {
	
	private StoreVo storeVo;
	
	public Buyer(int money, int productQuantity){
		System.out.println("구매자를 생성합니다.");
		
		storeVo.setMoney(money);
		storeVo.setProductQuantity(productQuantity);
		
	}
	@Override
	public void buy() {
		storeVo.minusMoney();
		
	}
	
	@Override
	public void productQuantity() {
		storeVo.productQuantityPlus();
		
	}

}
