package com.ktds.khw.dao;

import java.util.List;

import com.ktds.khw.vo.HumanVO;
import com.ktds.khw.vo.VandingMachineVO;

public interface VandingMachineDao {
	
	public void inputMoney(int money);
	
	public List<HumanVO> humanDrinkNumber();
	
	public void vandingMachineMoney(int money);
	
	public List<VandingMachineVO> vandingMachineDrinkNumber();
	
}
