package com.ktds.khw.make;

import java.io.File;

public class MakeDirectory {

	public void start() {

		String directoryPath = "D:\\game";

		// 폴더 만들기
		File game = new File(directoryPath);

		// 폴더를 생성한다.
		if (!game.exists()) {//game 폴더가 존재하는지 여부 묻기 / 존재하지 않는다면 생성
			game.mkdir();
		}
	}

	public static void main(String[] args) {

		new MakeDirectory().start();

	}

}
