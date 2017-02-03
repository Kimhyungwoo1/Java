package com.ktds.khw;

import java.util.Scanner;

import com.ktds.khw.biz.*;

public class BankController {
	
	private BankBizImpl bankBiz;
	private Scanner input = new Scanner(System.in);
	
	public void start() {
		bankBiz = new BankBizImpl();
		bankBiz.selectService();
	}

	public static void main(String[] args) {
		new BankController().start();
	}
	
}
