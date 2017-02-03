package com.ktds.khw.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.vo.UserVo;

public class BankDaoImpl implements BankDao{

	List<UserVo> userList;

	public BankDaoImpl() {
		userList = new ArrayList<UserVo>();
	}
	
	@Override
	public List<UserVo> searchUser() {
		return userList;
	}

	@Override
	public void addUser(UserVo user) {
		userList.add(user);
	}

	@Override
	public void deposit( UserVo user, int money ) {
		user.setMoney(user.getMoney() + money);
	}

	@Override
	public int withDraw( UserVo user, int money ) {
		user.setMoney(user.getMoney() - money);
		return money;
	}

}
