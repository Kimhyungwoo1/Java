package com.ktds.khw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.vo.DepartmentVO;
import com.ktds.khw.vo.LocationVO;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public List<DepartmentVO> departementList() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 드라이버 로딩 실패, 시스템을 종료합니다.");
			return null;
		}

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String oracleUrl = "jdbc:oracle:thin:@172.20.10.9:1521:XE";

		try {

			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");

			String qeury = "  SELECT  " + "  DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID,  " + "   LOCATION_ID "
					+ "FROM HR.DEPARTMENTS ";

			stmt = conn.prepareStatement(qeury);
			rs = stmt.executeQuery();

			DepartmentVO departmentVO = null;
			List<DepartmentVO> departmentList = new ArrayList<DepartmentVO>();
			while (rs.next()) {
				departmentVO = new DepartmentVO();
				departmentVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentVO.setManageId(rs.getInt("MANAGER_ID"));
				departmentVO.setLocationId(rs.getInt("LOCATION_ID"));

				departmentList.add(departmentVO);
			}
			return departmentList;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 드라이버 로딩 실패, 시스템을 종료합니다.");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<LocationVO> locationList() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 드라이버 로딩 실패 시스템을 종료합니다. ");
			return null;
		}

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String oracleUrl = "jdbc:oracle:thin:@172.20.10.9:1521:XE";

		try {
			
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");

			String qeury = "SELECT  L.CITY " + "        , D.DEPARTMENT_NAME " + "        , L.STREET_ADDRESS "
					+ "FROM    DEPARTMENTS D " + "        , LOCATIONS L " + "WHERE   L.LOCATION_ID = D.LOCATION_ID ";

			stmt = conn.prepareStatement(qeury);

			rs = stmt.executeQuery();

			LocationVO locationVO = null;
			DepartmentVO departmentVO = null;
			List<LocationVO> locationList = new ArrayList<LocationVO>();

			while (rs.next()) {
				locationVO = new LocationVO();
				departmentVO = new DepartmentVO();

				locationVO.setCity(rs.getString("CITY"));
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				locationVO.setStreetAddress(rs.getString("STREET_ADDRESS"));

				locationList.add(locationVO);

			}
			return locationList;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 인스턴스 로딩 실패, 시스템으로 종료합니다.");
			return null;
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
