package com.ktds.khw;

import com.ktds.khw.helper.FileWriteHelper;

public class Calculator {

	FileWriteHelper fileWriteHelper = new FileWriteHelper();
	
	public void start(){
		
		int result = 10 + 70;
		String message = String.format("%d + %d = %d", 10, 70, result);
		System.out.println(message);
		
		
		fileWriteHelper.log(message);
	}
	
	public static void main(String[] args) {
		
		new Calculator().start();
		
	}

}
