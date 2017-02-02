package com.ktds.khw.employeemenagemant.dao;

import java.util.List;

import com.ktds.khw.employeemenagemant.vo.EmployeeMenagementVO;

public interface EmployeeMenagementDao {
	
	public List<EmployeeMenagementVO> queryAllList(); 
	
	public void addEmployee (EmployeeMenagementVO newEmployee);
	
	public void removeEmployee (int index);
	
	public void updateEmployee (int index, EmployeeMenagementVO updateEmployee);

}
