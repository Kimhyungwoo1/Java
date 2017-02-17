package com.ktds.khw;

import com.ktds.khw.biz.BookStoreBiz;
import com.ktds.khw.biz.BookStoreBizImpl;

public class BookStoreController {

	BookStoreBiz bookStoreBiz;
	public BookStoreController() {
		bookStoreBiz = new BookStoreBizImpl();
	}
	
	public void start() {
		bookStoreBiz.printBookStore();

	}
	
	public static void main(String[] args) {
		new BookStoreController().start();
	}
}
