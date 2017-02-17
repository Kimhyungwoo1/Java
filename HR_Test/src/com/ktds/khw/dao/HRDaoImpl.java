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
import com.ktds.khw.vo.LocationsVO;

public class HRDaoImpl implements HRDao {

	@Override
	public List<EmployeesVO> employeeList() {

		// 1. Oracle Driver Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패! 시스템을 종료합니다.");
			return null;
		}

		// 2. JDBC Instance 생성
		Connection conn = null; // 오라클 접속을 위한 변수
		PreparedStatement stmt = null; // 오라클에게 쿼리를 보내 실행을 요청하는 중계
		ResultSet rs = null; // 실행된 후 결과를 받아오는 변수

		// 3. Oracle instance 연결
		String oracleUrl = "jdbc:oracle:thin:@192.168.0.47:1521:XE";

		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			// 4. 쿼리를 만든다.
			String query = "SELECT  " + "   EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  "
					+ "   EMAIL, PHONE_NUMBER, HIRE_DATE,  " + "   JOB_ID, SALARY, COMMISSION_PCT,  "
					+ "   MANAGER_ID, DEPARTMENT_ID " + " FROM HR.EMPLOYEES ";

			// 5. 쿼리 실행
			stmt = conn.prepareStatement(query);

			// 6. 쿼리의 실행결과를 얻어온다.
			rs = stmt.executeQuery();

			// 6-1 쿼리의 실행결과를 List로 불러온다.
			EmployeesVO employeeVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();

			while (rs.next()) {
				// 6-2 ROW의 정보를 employeesVO에 셋팅한다.
				employeeVO = new EmployeesVO();
				employeeVO.setEmployeeId(rs.getInt("EMPLOYEE_ID")); // 있는 그대로 읽으면 된다.employeeVO의 셋터에 conn이 가져온
				employeeVO.setFirstName(rs.getString("FIRST_NAME")); // 오라클의 정보를 넣는다.
				employeeVO.setLastName(rs.getString("LAST_NAME"));
				employeeVO.setEmail(rs.getString("EMAIL"));
				employeeVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeeVO.setHireDate(rs.getString("HIRE_DATE"));
				employeeVO.setJobId(rs.getString("JOB_ID"));
				employeeVO.setSalaly(rs.getInt("SALARY"));
				employeeVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeeVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeeVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));

				// 6-3 employees 에 employeesVO 를 add한다.
				employees.add(employeeVO);

			}
			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Oracle 인스턴스에 연결하지 못했습니다. 시스템을 종료합니다.");
			return null;
		} finally { // finally 를 하는 이유는 오라클에 접속해서 정보를 받아오는데 프로그램은
					// 자동으로 접속을 끊을 수 없다. 그래서 선언한 역순으로 우리가 끊어줘야 한다.
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

	@Override
	public List<DepartmentVO> departmentList() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 못했다. 문제점 찾아");
			return null;
		}

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String oracleUrl = "jdbc:oracle:thin:@172.20.10.9:1521:XE";

		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");

			String query = "SELECT  " + "   DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID,  " + "   LOCATION_ID "
					+ "FROM HR.DEPARTMENTS ";

			stmt = conn.prepareStatement(query);

			rs = stmt.executeQuery();

			DepartmentVO departmentVO = null;
			List<DepartmentVO> departmentList = new ArrayList<DepartmentVO>();

			while (rs.next()) {
				departmentVO = new DepartmentVO();
				departmentVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentVO.setManagerId(rs.getInt("MANAGER_ID"));
				departmentVO.setLocationId(rs.getInt("LOCATION_ID"));
				departmentList.add(departmentVO);
			}
			return departmentList;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 인스턴스 연결 안됬으니까 오류 찾아봐.");
			return null;
		} finally {
			try {
				if( rs != null ){
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if ( stmt != null ){
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if ( conn != null ) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}
	}

	@Override
	public List<LocationsVO> locationList() {
		
		try {
			Class.forName("oracle.jdbc.dirver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 드라이버 못찾았으니까 찾아" );
		}
		
		Connection conn = null;
		PreparedStatement stmt= null;
		ResultSet rs = null;
		
		String oracleUrl = "jdbc:oracle:thin:@172.20.10.9:1521:EX";
		
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "he");
			
			String query = "SELECT  " 
					+"   LOCATION_ID, STREET_ADDRESS, POSTAL_CODE,  "
					+"   CITY, STATE_PROVINCE, COUNTRY_ID "
					+"   FROM HR.LOCATIONS " ;
			
			stmt = conn.prepareStatement(query);
			
			rs = stmt.executeQuery();
			
			LocationsVO locationsVO = null;
			List<LocationsVO> locationsList = new ArrayList<LocationsVO>();
			
			while ( rs.next() ){
				
				locationsVO.setLocationId(rs.getInt("LOCATION_ID"));
				locationsVO.setLocationId(rs.getInt("LOCATION_ID"));
				locationsVO.setLocationId(rs.getInt("LOCATION_ID"));
				locationsVO.setLocationId(rs.getInt("LOCATION_ID"));
				locationsVO.setLocationId(rs.getInt("LOCATION_ID"));
				locationsVO.setLocationId(rs.getInt("LOCATION_ID"));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 인스턴스 못찻았으니까 다시해");
		}
		
		
		
		return null;
	}

}
