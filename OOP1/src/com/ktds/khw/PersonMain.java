package com.ktds.khw;

public class PersonMain {
	
	public static void main(String[] args){
		
		Person khw = new Person();
		khw.setName("김형우");
		khw.setJob("프로그래머");
		khw.introduce();
		
		Person wie = new Person();
		wie.setName("유정이");
		wie.setJob("백수");
		wie.introduce();
		
		Person unknown = new Person();
		unknown.introduce();
		
		Person ksk = new Person("김슬기", "감독");
		ksk.introduce();
		
	}

}
