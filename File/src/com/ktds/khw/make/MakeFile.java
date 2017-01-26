package com.ktds.khw.make;

import java.io.File;
import java.io.IOException;

public class MakeFile {

	public void start() {

		String filePath = "D:\\makeFile.txt";

		// 자동 인폴트 해주는 단축키 shift + ctrl + o
		File textFile = new File(filePath);

		try {
			// 파일을 실제 저장소에 생성한다.
			if (!textFile.exists()) {//text 파일이 존재하는지 여부 묻기 / 존재하지 않는다면 생성
				textFile.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new MakeFile().start();
	}

}
