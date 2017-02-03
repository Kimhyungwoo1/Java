package com.ktds.khw.biz;

import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.dao.VandingMachineDaoImpl;
import com.ktds.khw.vo.HumanVO;
import com.ktds.khw.vo.VandingMachineVO;

public class VandingMachineBizImpl implements VandingMachineBiz {
	
	VandingMachineDaoImpl vandingMachineDaoImpl;
	List<HumanVO> humanList;
	List<VandingMachineVO> vandingMachineList;
	VandingMachineVO vandingMachineVO;
	HumanVO humanVO;
	
	public VandingMachineBizImpl() {
		vandingMachineDaoImpl = new VandingMachineDaoImpl();
		vandingMachineVO = new VandingMachineVO();
		humanVO = new HumanVO();
		humanList = new ArrayList<HumanVO>();
		vandingMachineList = new ArrayList<VandingMachineVO>();
	}
	
	@Override
	public void inputMoney() {
		
	}

	@Override
	public void humanDrinkNumber() {
		
	}

	@Override
	public void vandingMachineMoney() {
		
	}

	@Override
	public void vandingMachineDrinkNumber() {
		
	}

}
