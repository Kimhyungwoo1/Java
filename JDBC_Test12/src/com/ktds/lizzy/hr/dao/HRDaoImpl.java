package com.ktds.lizzy.hr.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ktds.lizzy.dao.support.JDBCDaoSupport;
import com.ktds.lizzy.dao.support.QueryHandler;
import com.ktds.lizzy.dao.support.annotation.BindData;
import com.ktds.lizzy.hr.vo.*;

public class HRDaoImpl extends JDBCDaoSupport implements HRDao {
	
 @Override
    public List<EmployeesVO> getAllEmployees() {
	 	
	    return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query =
	                    " SELECT  " + " EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  " + "   EMAIL, PHONE_NUMBER, HIRE_DATE,  "
	                            + "   JOB_ID, SALARY, COMMISSION_PCT,  " + "   MANAGER_ID, DEPARTMENT_ID "
	                            + " FROM HR.EMPLOYEES ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}
	    	
	    });
        
    }
	
	@Override
	public List<DepartmentVO> getAllDepartments() {
		
		return selectList(new QueryHandler() {
			
			@Override
			public String preparedQuery() {
				String query = " SELECT  " +
						"   DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID,  " +
						"   LOCATION_ID " +
						"   FROM HR.DEPARTMENTS" +
						"   ORDER BY DEPARTMENT_ID DESC";
				return query;
			}
			
			@Override
			public void mappingParameters(PreparedStatement stmt) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Object getData(ResultSet rs) {
				DepartmentVO departmentVO = new DepartmentVO();
				BindData.bindData(rs, departmentVO);
				return departmentVO;
			}
		});
		
	}

	@Override
	public List<EmployeesVO> getAllEmployeesWithDepartments() {
		
		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query =
						" SELECT  E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  " 
								+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  "
								+ "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  " 
								+ "   E.MANAGER_ID, E.DEPARTMENT_ID,  "
						 		+ "   D.DEPARTMENT_ID D_DEPARTMENT_ID, D.DEPARTMENT_NAME, D.MANAGER_ID, D.LOCATION_ID"
						 		+ " FROM EMPLOYEES E, "
						 		+ " DEPARTMENTS D "
						 		+ " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				BindData.bindData(rs, employeesVO.getDepartments());
				return employeesVO;
			}
			
		});
		
	}

	@Override
	public List<DepartmentVO> getAllDepartmentsWithLocations() {
		
		return selectList(new QueryHandler() {
			
			@Override
			public String preparedQuery() {
				String query = "SELECT  " +
						"   D.DEPARTMENT_ID, D.DEPARTMENT_NAME, D.MANAGER_ID, D.LOCATION_ID D_LOCATION_ID, " +
						"   L.LOCATION_ID L_LOCATION_ID, L.STREET_ADDRESS, L.POSTAL_CODE,  " +
						"   L.CITY, L.STATE_PROVINCE, L.COUNTRY_ID " +
						"   FROM DEPARTMENTS D, LOCATIONS L " +
						"   WHERE D.LOCATION_ID = L.LOCATION_ID ";
				return query;
			}
			
			@Override
			public void mappingParameters(PreparedStatement stmt) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Object getData(ResultSet rs) {
				DepartmentVO departmentVO = new DepartmentVO();
				BindData.bindData(rs, departmentVO);
				BindData.bindData(rs, departmentVO.getLocationVo());
				return departmentVO;
			}
		});
		
	}

	@Override
	public List<CountriesVO> getAllCountriesWithRegions() {
		
		return selectList(new QueryHandler() {
			
			@Override
			public String preparedQuery() {
				String query = "SELECT  " +
						"C.COUNTRY_ID, C.COUNTRY_NAME, C.REGION_ID C_REGION_ID, R.REGION_ID R_REGION_ID, R.REGION_NAME " +
						"FROM    COUNTRIES C, REGIONS R " +
						"WHERE   C.REGION_ID = R.REGION_ID ";
				return query;
			}
			
			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Object getData(ResultSet rs) {
				CountriesVO countryVO = new CountriesVO();
				BindData.bindData(rs, countryVO);
				BindData.bindData(rs, countryVO.getRegionVO());
				return countryVO;
			}
		});
		
	}

	@Override
	public EmployeesVO findOneEmployee(int employeeId) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ�� ���� x");
			e.printStackTrace();
			return null;
		}
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String oracleUrl = "jdbc:oracle:thin:@172.20.10.9:1521:XE";
		
		try {
			conn = DriverManager.getConnection(oracleUrl, "hr", "chzhqhf486");
			
			StringBuffer query = new StringBuffer(); // String = �Ҹ�, StringBuffer = ����
			query.append(" SELECT	EMPLOYEE_ID ");
			query.append(" 			, FIRST_NAME ");
			query.append(" 			, LAST_NAME ");
			query.append(" 			, EMAIL ");
			query.append(" 			, PHONE_NUMBER ");
			query.append(" 			, JOB_ID ");
			query.append(" 			, HIRE_DATE ");
			query.append(" 			, SALARY ");
			query.append(" 			, COMMISSION_PCT ");
			query.append(" 			, MANAGER_ID ");
			query.append(" 			, DEPARTMENT_ID ");
			query.append(" FROM		EMPLOYEES ");
			query.append(" WHERE	EMPLOYEE_ID = ? ");
			
			stmt = conn.prepareStatement(query.toString()); // toString() : StringBuffer -> String
			stmt.setInt(1, employeeId); // 1��° index���Է� �� ���� (index�� 0�� ������ �� : �迭, ����Ʈ ��!)
			
			rs = stmt.executeQuery();
			
			EmployeesVO employee = null;
			
			if (rs.next()) { // ���ƾ� �����Ͱ� 1���̹Ƿ� while ��� if ���
				employee = new EmployeesVO();
				BindData.bindData(rs, employee);
			}
			
			return employee;
			
		} catch (SQLException e) {
			System.out.println("����Ŭ ��ü ȣ�� ����");
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				
			}
		}
	}
}










