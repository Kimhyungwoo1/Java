package com.ktds.khw.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.khw.dao.*;
import com.ktds.khw.vo.*;

public class BankBizImpl implements BankBiz {
	
	private Scanner input = new Scanner(System.in);
	
	private BankDao bankDao;
	private UserVo user;
	private String name;
	
	private boolean loginCheck = false;
	private boolean[] serviceCheck = {false, false, false};
	
	public BankBizImpl() {
		bankDao = new BankDaoImpl();
	}

	@Override
	public void searchUser() {
		System.out.println("기존 고객 확인을 위해 이름을 입력해주세요.");
		name = input.next();
		
		List<UserVo> userList = bankDao.searchUser();
		
		if (userList.size() == 0) {
			System.out.println("기존 고객이 아닙니다.");
			System.out.println("신규 고객 등록을 진행합니다.\n");
			this.addUser();
		}
		else {
			boolean check = false;
			for (UserVo user : userList) {
				if (!(user.getUser()).equals(name)) {
					continue;
				}
				else {
					check = true;
					loginCheck = true;
					System.out.println("기존 고객입니다.\n");
					this.user = user;
					checkService();
				}
				break;
			}
			
			if (!check) {
				System.out.println("기존 고객이 아닙니다.");
				System.out.println("신규 고객 등록을 진행합니다.\n");
				this.addUser();
			}
		}
	}

	private void checkService() {
		if (serviceCheck[0]) {
			this.deposit();
		}
		else if (serviceCheck[1]) {
			this.withDraw();
		}
		else if (serviceCheck[2]) {
			this.addUser();
		}
	}
	
	public void selectService() {
		System.out.println("<은행 제공 서비스>");
		System.out.println("1. 예금 2. 출금 3. 회원등록 4. 나가기");
		int chooseService = input.nextInt();
		
		if (chooseService == 1) {
			serviceCheck[0] = true;
			this.deposit();
		}
		else if (chooseService == 2) {
			serviceCheck[1] = true;
			this.withDraw();
		}
		else if (chooseService == 3) {
			serviceCheck[2] = true;
			this.addUser();
		}
		else if (chooseService == 4) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	@Override
	public void deposit() {
		if (!loginCheck) {
			this.searchUser();
		}
		else {
			System.out.println("===== 예금  =====");
			System.out.printf("저축액 : %d\n", user.getMoney());
			System.out.println("얼마를 예금하시겠습니까?");
			int money = input.nextInt();
			bankDao.deposit(user, money);
			System.out.println("예금을 완료하였습니다.");
			System.out.printf("저축액 : %d\n\n", user.getMoney());
			
			serviceCheck[0] = false;
			this.selectService();
		}
	}

	@Override
	public void withDraw() {
		if (!loginCheck) {
			this.searchUser();
		}
		else {
			System.out.println("===== 출금  =====");
			System.out.printf("저축액 : %d\n", user.getMoney());
			System.out.println("얼마를 출금하시겠습니까?");
			int money = input.nextInt();
			bankDao.withDraw(user, money);
			System.out.println("출금을 완료하였습니다.");
			System.out.printf("저축액 : %d\n\n", user.getMoney());
			
			serviceCheck[1] = false;
			this.selectService();
		}
	}
	
	@Override
	public void addUser() {
		UserVo user;
		List<UserVo> userList = bankDao.searchUser();
		
		System.out.println("=====회원 등록=====");
		System.out.println("이름을 입력해주세요.");
		name = input.next();
		System.out.println("신규 회원은 반드시 5000원을 예치해야 합니다.");
		while (true) {		
			System.out.println("동의하십니까? (y/n)");
			String agree = input.next();

			if (agree.equals("y")) {
				user = new UserVo(name, 5000);
				userList.add(user);
				System.out.println("회원 등록이 완료되었습니다.\n");
				break;
			}
			else {
				System.out.println("회원등록이 실패했습니다.\n");
			}
		}
		
		serviceCheck[2] = false;
		this.selectService();
	}

}
