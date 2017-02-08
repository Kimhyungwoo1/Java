package com.ktds.khw.hr.biz;

import java.util.List;

import com.ktds.khw.hr.dao.HRDao;
import com.ktds.khw.hr.dao.HRDaoImpl;
import com.ktds.khw.hr.vo.EmployeesVO;

public class Main {
	
	public static void main(String[] args){
		
		HRDao hrDao = new HRDaoImpl();
		List<EmployeesVO> employees = hrDao.getAllEmpoyees();
		
		for( EmployeesVO employeesVO : employees){
			System.out.print(employeesVO.getEmployeeId() + "\t");
			System.out.print(employeesVO.getFirstName() + "\t");
			System.out.println(employeesVO.getLastName());
		}
		
	}

}
