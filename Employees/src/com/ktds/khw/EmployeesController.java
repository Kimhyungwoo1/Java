package com.ktds.khw;

import com.ktds.khw.biz.EmployeesBiz;
import com.ktds.khw.biz.EmployeesBizImpl;

public class EmployeesController {
	
	EmployeesBiz employeesBiz;
	
	public EmployeesController () {
		employeesBiz = new EmployeesBizImpl();
	}
	
	public void start() {
		employeesBiz.printEmployee();
	}
	public static void main(String[] args) {
		new EmployeesController().start();
	}

}
