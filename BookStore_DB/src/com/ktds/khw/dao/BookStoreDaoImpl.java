package com.ktds.khw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.vo.BookVO;

public class BookStoreDaoImpl implements BookStoreDao{

	@Override
	public List<BookVO> BookList() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패, 시스템을 종료합니다.");
			e.printStackTrace();
			return null;
		}
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String oracleUrl = "jdbc:oracle:thin:@172.20.10.9:1521:XE";
		
		try {
			conn = DriverManager.getConnection(oracleUrl, "BOOKSTORE", "bookstore");
			
			String query = "  SELECT  " 
					+ "   BOOK_ID,  BOOK_NAME,  BOOK_AUTHOR,  " 
					+ "   BOOK_PRICE, PUBLISHER " 
					+ "   FROM BOOKSTORE.BOOK  "  ;
			
			stmt = conn.prepareStatement(query);
			
			rs = stmt.executeQuery();
			
			BookVO bookVO = null;
			List<BookVO> bookList = new ArrayList<BookVO>();
			while ( rs.next() ){
				bookVO = new BookVO();
				bookVO.setBookId(rs.getInt("BOOK_ID"));
				bookVO.setBookName(rs.getString("BOOK_NAME"));
				bookVO.setBookAuthor(rs.getString("BOOK_AUTHOR"));
				bookVO.setBookPrice(rs.getInt("BOOK_PRICE"));
				bookVO.setPublisher(rs.getString("PUBLISHER"));
			
				bookList.add(bookVO);
			
			}
			
			return bookList;
			
		} catch (SQLException e) {
			System.out.println("오라클 인스턴스 로딩 실패, 시스템을 종료합니다.");
			e.printStackTrace();
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
				if( stmt != null ){
				stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if( conn != null ){
				conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}
