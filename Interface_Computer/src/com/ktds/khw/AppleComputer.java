package com.ktds.khw;

public class AppleComputer implements FaceTime{

	@Override
	public void input() {
		System.out.println("Mac Keyvoard 로 입력합니다.");
		
	}

	@Override
	public void compute() {
		System.out.println("Apple CPU를 사용해 계산합니다.");
		
	}

	@Override
	public void store() {
		System.out.println("Samsung SSD 에 저장합니다.");
		
	}
	
	@Override
	public void faceTime() {
		System.out.println("카메라로 영상통화를 합니다.");
	}
	

}
