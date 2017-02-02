package com.ktds.khw;

import java.util.Scanner;

public class Human {

	Scanner input = new Scanner(System.in);

	public int InputManu() {
		int chooseManu = input.nextInt();
		return chooseManu;
	}

	public int inputSeatLine() {
		System.out.println("줄을 선택하세요! (0 or 8)");
		int chooseLine = 0;
		while (true) {
			chooseLine = input.nextInt();
			if (chooseLine >= 0 || chooseLine <= 8) {
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
		int chooseColumn = input.nextInt();
		return chooseColumn;
	}
}
