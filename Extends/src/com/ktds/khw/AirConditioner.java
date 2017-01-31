package com.ktds.khw;

public class AirConditioner extends AirCleaner  {
	
	/**
	 * 냉방 설정온도
	 */
	private int temp = 26;
	
	/**
	 * 전원 켬
	 */
	@Override
	public void powerOn() {
		
		System.out.println("에어컨을 켭니다.");
		System.out.println("시원해 집니다.");
		
		cooling();
		
		super.powerOn();
		System.out.println("공기청정기 제조사 : " + super.manufactor);
		System.out.println("공기 청정기 제조국가 : " + super.origin);
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void cooling(){
		temp--;
		System.out.println("현제 설정 온도는 " + temp + "입니다.");
	}
}
