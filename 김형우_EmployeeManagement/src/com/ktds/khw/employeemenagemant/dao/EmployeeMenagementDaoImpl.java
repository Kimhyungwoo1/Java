package com.ktds.khw.employeemenagemant.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.employeemenagemant.vo.EmployeeMenagementVO;

public class EmployeeMenagementDaoImpl implements EmployeeMenagementDao{
	
	
	private List<EmployeeMenagementVO> menagement;
	
	public EmployeeMenagementDaoImpl() {
		menagement = new ArrayList<EmployeeMenagementVO>();
	}
	

	@Override
	public List<EmployeeMenagementVO> queryAllList() {
		return menagement;
	}

	@Override
	public void addEmployee(EmployeeMenagementVO newEmployee) {
		menagement.add(newEmployee);
		
	}

	@Override
	public void removeEmployee(int index) {
		menagement.remove(index);
		
	}

	@Override
	public void updateEmployee(int index, EmployeeMenagementVO updateEmployee) {
		menagement.set(index, updateEmployee);
		
	}

}
