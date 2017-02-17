package com.ktds.khw.biz;

import java.util.ArrayList;
import java.util.List;

import com.ktds.khw.dao.BookStoreDao;
import com.ktds.khw.dao.BookStoreDaoImpl;
import com.ktds.khw.vo.BookVO;

public class BookStoreBizImpl implements BookStoreBiz{

	BookStoreDao bookStoreDao;
	
	public BookStoreBizImpl () {
		bookStoreDao = new BookStoreDaoImpl();
	}
	
	@Override
	public void printBookStore() {
		
		List<BookVO> bookList = bookStoreDao.BookList();
		
		for(BookVO bookVO : bookList) {
			System.out.printf("%d\t%s\t\t%d\t\t%s\n"
					, bookVO.getBookId()
					, bookVO.getBookName()
					, bookVO.getBookPrice()
					, bookVO.getBookAuthor());
			
			
		}
		
		
		
	}

}
