package com.ktds.khw;
import java.util.Scanner;

public class ThorwsNumberFormatException {

	public static void main(String[] args) {

		try {
			convertStringtoNumber(null);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("문자를 다시 생성합니다.");
		}
	}

	public static void convertStringtoNumber(String str) throws Exception {
		if (str == null) {
			throw new Exception("파라미터를 작성해 주세요.");

		}
		int number = Integer.parseInt("Number");

	}

}
