package com.ktds.khw.vo;

public class UserVo {
	
	private int money;
	private String user;
	
	public UserVo(String user, int money) {
		this.money = money;;
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
