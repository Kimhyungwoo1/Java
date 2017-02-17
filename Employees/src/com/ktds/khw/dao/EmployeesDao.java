package com.ktds.khw.dao;

import java.util.List;

import com.ktds.khw.vo.EmployeesVO;

public interface EmployeesDao {

	List<EmployeesVO> employeeWithDepartment();
	
}
