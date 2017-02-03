package com.ktds.khw.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.vo.HumanVO;
import com.ktds.khw.vo.VandingMachineVO;

public class VandingMachineDaoImpl implements VandingMachineDao {

	List<HumanVO> humanList;
	List<VandingMachineVO> vandingMachineList;
	VandingMachineVO vandingMachineVO;
	HumanVO humanVO;
	//HumanVO humanVO;

	public VandingMachineDaoImpl() {
		vandingMachineVO = new VandingMachineVO();
		humanVO = new HumanVO();
		humanList = new ArrayList<HumanVO>();
		vandingMachineList = new ArrayList<VandingMachineVO>();
		
	}

	@Override
	public void inputMoney(int money) {
		vandingMachineVO.setVandingMachineMoney(vandingMachineVO.getVandingMachineMoney() + money);
	}

	@Override
	public List<HumanVO> humanDrinkNumber() {
		return humanList;
	}

	@Override
	public void vandingMachineMoney(int money) {
		vandingMachineVO.setVandingMachineMoney(vandingMachineVO.getVandingMachineMoney() + money);
	}

	@Override
	public List<VandingMachineVO> vandingMachineDrinkNumber() {
		return vandingMachineList;
	}

}
