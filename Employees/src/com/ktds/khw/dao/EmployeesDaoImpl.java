package com.ktds.khw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.vo.DepartmentVO;
import com.ktds.khw.vo.EmployeesVO;
import com.ktds.khw.vo.JobsVO;
import com.ktds.khw.vo.LocationVO;

public class EmployeesDaoImpl implements EmployeesDao{

	@Override
	public List<EmployeesVO> employeeWithDepartment() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 드라이버 로딩 실패 ");
			return null;
		}
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String oracleUrl = "jdbc:oracle:thin:@172.20.10.9:1521:XE";
		
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			
			String query ="  SELECT  E.EMPLOYEE_ID " 
					+"        , D.DEPARTMENT_NAME " 
					+"        , L.CITY " 
					+"        , J.JOB_TITLE " 
					+"   FROM    EMPLOYEES E " 
					+"        , DEPARTMENTS D " 
					+"        , JOBS J " 
					+"        , LOCATIONS L " 
					+"   WHERE   E.DEPARTMENT_ID = D.DEPARTMENT_ID " 
					+"   AND     D.LOCATION_ID = L.LOCATION_ID " 
					+"   AND     J.JOB_ID = E.JOB_ID " ;
			
			stmt = conn.prepareStatement(query);
			
			rs = stmt.executeQuery();
			
			EmployeesVO employeesVO = null;
			DepartmentVO departmentVO = null;
			JobsVO jobsVO = null;
			LocationVO locationVO = null;
			List<EmployeesVO> employeesList = new ArrayList<EmployeesVO>();
			
			while ( rs.next() ){
				
				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				
				departmentVO = employeesVO.getDepartmentVO();
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				
				locationVO = departmentVO.getLocationVO();
				locationVO.setCity(rs.getString("CITY"));
				
				jobsVO = employeesVO.getJobsVO();
				jobsVO.setJobTitle(rs.getString("JOB_TITLE"));
				
				employeesList.add(employeesVO);
				
			}
			return employeesList;
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 인스턴스 로딩 실패");
			return null;
		} finally {
			try {
				if( rs != null ){
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if ( stmt != null ) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if ( conn != null ) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
