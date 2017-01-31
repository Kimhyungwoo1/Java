package com.ktds.khw;

public class LGComputer implements Computer{

	@Override
	public void input() {
		System.out.println("전자식 키보드로 입력합니다.");
		
	}

	@Override
	public void compute() {
		System.out.println("Intel core i5-6700U 로 계산합니다.");
		
	}

	@Override
	public void store() {
		System.out.println("Western Digital SSD에 저장합니다.");
		
	}

}
