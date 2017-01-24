package com.ktds.khw;

public class ArmyMain {

	public static void main(String[] args){
		
		//군인 객체를 만들어 주는 클래스 (객체)
		Army army = new Army();
		
		Person kdj = army.makeArmy("김도준");
		
		System.out.println(kdj.getName());
		System.out.println(kdj.getjob());
		
		Person iej = army.makeArmy("김형우");
		
		System.out.println(iej.getName());
		System.out.println(iej.getjob());
		
	}
}
