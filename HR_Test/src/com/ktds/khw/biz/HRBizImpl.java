package com.ktds.khw.biz;


import java.util.List;

import com.ktds.khw.dao.HRDao;
import com.ktds.khw.dao.HRDaoImpl;
import com.ktds.khw.vo.DepartmentVO;
import com.ktds.khw.vo.EmployeesVO;

public class HRBizImpl implements HRBiz{

	private HRDao hrDao; 
	
	public HRBizImpl () {
		hrDao = new HRDaoImpl();
	}
	
	@Override
	public void AllPrintEmployee() {
		
		List<EmployeesVO> allEmployee = hrDao.employeeList();
		
		for(EmployeesVO employeesVO : allEmployee)
		System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\n"
				, employeesVO.getEmployeeId()
				, employeesVO.getFirstName()
				, employeesVO.getLastName()
				, employeesVO.getEmail()
				, employeesVO.getPhoneNumber()
				, employeesVO.getHireDate()
				, employeesVO.getJobId()
				, employeesVO.getSalaly()
				, employeesVO.getCommissionPct()
				, employeesVO.getManagerId()
				, employeesVO.getDepartmentId());
		
	}

	@Override
	public void AllPrintDepartment() {
		
		List<DepartmentVO> allDepartmentList = hrDao.departmentList();
		
		for(DepartmentVO departmentVO : allDepartmentList) {
			System.out.printf("%d\t%s\t%d\t%d\n"
					, departmentVO.getDepartmentId()
					, departmentVO.getDepartmentName()
					, departmentVO.getManagerId()
					, departmentVO.getLocationId());
		}
		
	}

}
