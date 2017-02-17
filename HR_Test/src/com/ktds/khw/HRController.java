package com.ktds.khw;

import com.ktds.khw.biz.HRBiz;
import com.ktds.khw.biz.HRBizImpl;

public class HRController {
	
	private HRBiz hrBiz;
	
	public HRController () {
		hrBiz = new HRBizImpl();
	}

	public void start() {
		hrBiz.AllPrintEmployee();
	}
	
	public static void main(String[] args) {
		new HRController().start();
	}
	
}
