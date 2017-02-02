package com.ktds.khw;

import com.ktds.khw.exceptions.MissingValueException;
import com.ktds.khw.exceptions.MissmatchValueException;

public class Student {

	public void start() throws MissmatchValueException{
		try {
			registNewStudent();
		} catch (MissingValueException e) {
			System.out.println(e.getMessage());
		} finally{
			System.out.println("잘 처리 됬습니다.");
		}
		
		System.out.println("정상적으로 수행되었습니다.");

	}

	public void registNewStudent() throws MissingValueException{

		String name = null;
		String school = "ktds1";

		if (name == null) {
			throw new MissingValueException("이름은 필수 입력 값입니다.");
		}

		if (!school.equals("ktds")) {
			throw new MissmatchValueException("학교 이름이 잘못 되었습니다.");
		}
	}

	public static void main(String[] args) {
	try {
		new Student().start();
	} catch (MissmatchValueException e) {
		e.printStackTrace();
	}
	}
}
