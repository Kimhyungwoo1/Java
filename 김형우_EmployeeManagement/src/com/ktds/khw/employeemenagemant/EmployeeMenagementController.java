package com.ktds.khw.employeemenagemant;

import java.util.Scanner;

import com.ktds.khw.employeemenagemant.biz.EmployeeMenagementBizImpl;

public class EmployeeMenagementController {

	private Scanner input = new Scanner(System.in);

	private int chooseMenu = 0;

	public void start() {
		
		EmployeeMenagementBizImpl employeeMenagementBizImpl = new EmployeeMenagementBizImpl();

		while (true) {
			System.out.println("===========직원관리 시스템==============");
			System.out.println("1. 전체 직원 조회하기");
			System.out.println("2. 직원추가 (입사) ");
			System.out.println("3. 직원 삭제 (퇴사)");
			System.out.println("4. 직원 진급 (진급)");
			System.out.println("5. 프로그램 종료 ");
			System.out.println("======================================");
			chooseMenu = input.nextInt();

			if (chooseMenu == 1) {
				employeeMenagementBizImpl.queryAllList();
			}
			else if (chooseMenu == 2) {
				employeeMenagementBizImpl.addEmployee();
			}
			else if (chooseMenu == 3) {
				employeeMenagementBizImpl.removeEmployee();
			}
			else if (chooseMenu == 4) {
				employeeMenagementBizImpl.updateEmployee();
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new EmployeeMenagementController().start();
	}

}
