package com.ktds.khw.news;

import java.util.Scanner;

import com.ktds.khw.news.biz.NewsBizImpl;

public class NewsController {

	NewsBizImpl newsBizImpl = new NewsBizImpl();
	
	private Scanner input = new Scanner(System.in);
	private int chooseNember = 0;

	public void start() {

		
		while (true) {
			
			System.out.println("==========뉴스 게시판 프로그램===========");
			System.out.println("1. 전체 뉴스 기사 제목 조회");
			System.out.println("2. 뉴스 기사 제목 등록");
			System.out.println("3. 종료");
			System.out.println("=====================================");
			chooseNember = input.nextInt();
			
			if (chooseNember == 1) {
				newsBizImpl.queryAllNews();
			} 
			else if (chooseNember == 2) {
				newsBizImpl.addNewNews();
			} 
			else {
				break;
			}
		}

	}

	public static void main(String[] args) {
		new NewsController().start();
	}
}
