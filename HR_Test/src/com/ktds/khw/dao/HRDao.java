package com.ktds.khw.dao;

import java.util.List;

import com.ktds.khw.vo.DepartmentVO;
import com.ktds.khw.vo.EmployeesVO;
import com.ktds.khw.vo.LocationsVO;

public interface HRDao {
	
	public List<EmployeesVO> employeeList();
	
	public List<DepartmentVO> departmentList(); 
	
	public List<LocationsVO> locationList();

}
