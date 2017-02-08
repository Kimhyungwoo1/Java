package com.ktds.khw.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.hr.vo.EmployeesVO;

public class HRDaoImpl implements HRDao {

	@Override
	public List<EmployeesVO> getAllEmpoyees() {

		// 1. Oracle Driver Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패! 시스템을 종료합니다.");
			return null;

		}

		// 2. JDBC Instance 생성
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		System.out.println("aa");
		// 3. Oracle Instance에 연결
		String oracleUrl = "jdbc:oracle:thin:@192.168.1.159:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			System.out.println("dd");
			// 4. 쿼리를 만들다.
			String query = " SELECT  " + "   EMPLOYEE_ID " + "   , FIRST_NAME " + "   , LAST_NAME,  "
					+ "   EMAIL, PHONE_NUMBER, HIRE_DATE,  " + "   JOB_ID, SALARY, COMMISSION_PCT,  "
					+ "   MANAGER_ID, DEPARTMENT_ID " + " FROM HR.EMPLOYEES ";

			// 5. 쿼리를 실행한다.
			stmt = conn.prepareStatement(query);
			System.out.println("zz");
			// 6.쿼리의 실행결과를 얻어온다.
			rs = stmt.executeQuery();

			// 6-1. 쿼리의 실행결과를 List 객체에 할당한다.
			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
			while (rs.next()) {

				// 6.2 ROW의 정보를 employeesVO에 셋팅한다.
				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEES_ID"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setSalary(rs.getInt("SALARY"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));

				// 6-3. employees 에 employeesVO 를 add한다.
				employees.add(employeesVO);

			}

			// 7.return 한다.
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Oracle 인스턴스에 연결하지 못했습니다. 시스템을 종료합니다.");
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
