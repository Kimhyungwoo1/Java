package com.ktds.khw.dao;

import java.util.List;

import com.ktds.khw.vo.UserVo;

public interface BankDao {
	
	public List<UserVo> searchUser();
	
	public void addUser(UserVo user);
	
	public void deposit( UserVo user, int money );
	
	public int withDraw( UserVo user, int money );

}
