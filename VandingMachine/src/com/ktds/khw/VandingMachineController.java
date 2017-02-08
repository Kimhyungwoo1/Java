package com.ktds.khw;

import java.util.Scanner;

import com.ktds.khw.vo.VandingMachineVO;

public class VandingMachineController {

	Scanner input = new Scanner(System.in);

	VandingMachineVO vandingMachineVO = new VandingMachineVO();

	public void start() {
		System.out.println("=========자전거 대여점===========");
		System.out.println("대여할 자전거를 선택하세요.");
		System.out.printf("1.콜라 : %d, 2.사이다 : %d, 3.환타 : %d, 4.종료", vandingMachineVO.getVandingMachineCoke(),
				vandingMachineVO.getVandingMachineCider(), vandingMachineVO.getVandingMachineFanta());
		
		int chooseNumber = input.nextInt();

		while (true) {
			if (chooseNumber == 1) {

			} 
			else if (chooseNumber == 2) {

			} 
			else if (chooseNumber == 3) {

			} 
			else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		new VandingMachineController().start();
	}

}
