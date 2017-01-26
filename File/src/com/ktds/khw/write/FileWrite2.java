package com.ktds.khw.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite2 {
	
	public void start(){
		
		String filePath = "D:\\makeFile.txt";
		
		try {
			//한줄로 만듬
			PrintWriter printWriter = new PrintWriter( new BufferedWriter( new FileWriter(filePath, true)) );
			
			//파일을 작성한다.
			printWriter.println("파일을 작성합니다 더럽게 복잡하네요! 짜증나게");
			
			printWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new FileWrite2().start();
	}

}
