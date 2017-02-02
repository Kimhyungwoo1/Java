package com.ktds.khw;

import java.util.Scanner;

public class CinemaMachine {

	Scanner input = new Scanner(System.in);

	private String[][] seatArray = { 
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			{ "□", "□", " ", " ", "□", "□", "□", "□", " ", " ", "□", "□"},
			};

	private String seatArrayEmpty = "□";
	private String seatArrayFull = "■";

	public String[][] getSeatArray() {
		return seatArray;
	}

	public void setSeatArray(String[][] seatArray) {
		this.seatArray = seatArray;
	}

	public void reservasionOut() {

		for (int i = 0; i < seatArray.length; i++) {
			for (int j = 0; j < seatArray[i].length; j++) {
				System.out.printf(seatArray[i][j]);
			}
			System.out.println(" ");
		}
	}

	public void reservasionChangeEmpty(int line, int column) {

		if (seatArray[line][column] == seatArrayFull) {
			System.out.println("이미 예약이 완료된 좌석은 예약할 수 없습니다.");
		} else {
			this.seatArray[line][column] = null;
			this.seatArray[line][column] = seatArrayFull;
			System.out.println("----------------");
			for (int i = 0; i < seatArray.length; i++) {
				for (int j = 0; j < seatArray[i].length; j++) {
					System.out.printf(seatArray[i][j]);
				}
				System.out.println(" ");
			}
			System.out.println("----------------");
		}
	}

	public void reservasionChangeFull(int line, int column) {

		if (seatArray[line][column] == seatArrayEmpty) {
			System.out.println("예약이 안된 자리는 예약 취소를 할수 없습니다.");
		} else {
			this.seatArray[line][column] = null;
			this.seatArray[line][column] = seatArrayEmpty;
			System.out.println("----------------");
			for (int i = 0; i < seatArray.length; i++) {
				for (int j = 0; j < seatArray[i].length; j++) {
					System.out.printf(seatArray[i][j]);
				}
				System.out.println(" ");
			}
			System.out.println("----------------");
		}
	}
	
	public void reservasionDisplay(Human human) {

		int seatRow = human.inputSeatLine();
		int seatColumn = 0;
		while (true) {
			System.out.println("");
			while (true) {
				System.out.println("영화관 좌석 예약 관리 시스템");
				System.out.printf("1. 예약\n2. 예약취소\n3. 프로그램 종료\n");
				int chooseManu = human.InputManu();
				
				if (chooseManu == 1) {
					System.out.println("----------------");
					reservasionOut();
					System.out.println("----------------");
					System.out.println("예약할 자리를 선택하세요.");
					while (true) {
						seatColumn = human.inputSeatColumn();
						if (seatArray[seatRow][seatColumn].equals(" ")) {
							System.out.println("잘 못 입력했습니다.");
						}
						else {
							break;
						}
					}
					reservasionChangeEmpty(seatRow, seatColumn);
					System.out.println("예약을 더 하시겠습니까? (Yes : 0 , No : 1)");
					int chooseReservationNumber = input.nextInt();
					if (chooseReservationNumber == 0) {
						continue;
					} else {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
				} else if (chooseManu == 2) {
					System.out.println("----------------");
					reservasionOut();
					System.out.println("----------------");
					System.out.println("예약 취소할 자리를 선택하세요.");
					reservasionChangeFull(human.inputSeatLine(), human.inputSeatColumn());
					System.out.println("예약을 더 하시겠습니까? (Yes : 0 , No : 1)");
					int chooseReservationNumber = input.nextInt();
					if (chooseReservationNumber == 0) {
						continue;
					} else {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
				} else if (chooseManu == 3) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
			}
			break;
		}

	}

}
