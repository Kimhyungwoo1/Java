package com.ktds.khw;

import java.util.Scanner;

public class Human {

	Scanner input = new Scanner(System.in);

	public int inputManu() {
		int chooseManu = input.nextInt();
		return chooseManu;
	}

	public int inputSeatLine() {
		System.out.println("줄을 선택하세요! (0 or 1)");
		int chooseLine = 0;
		while (true) {
			chooseLine = input.nextInt();
			if (chooseLine == 0 || chooseLine == 1) {
				break;
			}
			else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요!");
			}
		}
		return chooseLine;
	}

	public int inputSeatColumn() {
		System.out.println("칸을 선택하세요! (0 or 11)");
		int chooseColumn = 0;
		while (true) {
			chooseColumn = input.nextInt();
			if (chooseColumn >= 0 || chooseColumn < 9) {
				break;
			} else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요!");
			}
		}
		return chooseColumn;
	}
}
