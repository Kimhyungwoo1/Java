package com.ktds.khw;

import com.ktds.khw.biz.DepartmentBiz;
import com.ktds.khw.biz.DepartmentBizImpl;

public class DepartmentController {
	
	DepartmentBiz departmentBiz;
	
	public DepartmentController() {
		departmentBiz = new DepartmentBizImpl();
	}
	
	public void start() {
		departmentBiz.printDepartmentWithLocation();
	}
	
	public static void main(String[] args) {
		new DepartmentController().start();
		
	}

}
