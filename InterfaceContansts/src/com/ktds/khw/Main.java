package com.ktds.khw;

import static com.ktds.khw.constants.MemberGradeConst.*; // 인터페이스의 상수만 가져오는 소스

public class Main {

	public void start() {
		
		int grade = 0;
		
		if ( grade == ADMIN ) {
			System.out.println("관리자님 환영합니다.");
		}
		else if ( grade == MEMBER ) {
			System.out.println("회원님 환영합니다.");
		}
		
	}
	
	public static void main(String[] args) {
		new Main().start();
	}
}
