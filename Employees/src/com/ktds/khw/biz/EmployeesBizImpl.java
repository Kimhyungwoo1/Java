package com.ktds.khw.biz;

import java.util.List;

import com.ktds.khw.dao.EmployeesDao;
import com.ktds.khw.dao.EmployeesDaoImpl;
import com.ktds.khw.vo.EmployeesVO;

public class EmployeesBizImpl implements EmployeesBiz {

	EmployeesDao employeesDao;

	public EmployeesBizImpl() {
		employeesDao = new EmployeesDaoImpl();
	}

	@Override
	public void printEmployee() {
		
		List<EmployeesVO> employeesList = employeesDao.employeeWithDepartment();
		
		for ( EmployeesVO employeesVO : employeesList){
			System.out.printf("%d\t%30s\t%20s\t%20s\n"
					, employeesVO.getEmployeeId()
					, employeesVO.getJobsVO().getJobTitle()
					, employeesVO.getDepartmentVO().getDepartmentName()
					, employeesVO.getDepartmentVO().getLocationVO().getCity());
		}
	}

}
