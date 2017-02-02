package com.ktds.khw.news.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.khw.news.dao.NewsDao;
import com.ktds.khw.news.dao.NewsDaoImpl;
import com.ktds.khw.news.vo.NewsVO;

public class NewsBizImpl implements NewsBiz{

	Scanner input = new Scanner(System.in);
	
	private NewsDao newsDao;
	
	public NewsBizImpl() {
		newsDao = new NewsDaoImpl();
		
	}
	
	@Override
	public void queryAllNews() {
		List<NewsVO> newsList = newsDao.queryAllNews();
		for ( NewsVO newsvo : newsList) {
			System.out.printf("1. 뉴스 제목 : %s 2. 언론사 : %s 3. 기자이름 : %s\n", newsvo.getNewsHeadLine(), newsvo.getNewsPress(), newsvo.getReporter());
		}
	}

	@Override
	public void addNewNews() {
		NewsVO newsvo;
		System.out.println("새로운 뉴스를 입력하세요.");
		System.out.println("1. 뉴스 이름 ");
		String inputNews = input.nextLine();
		System.out.println("2. 언론사 ");
		String inputPress = input.nextLine();
		System.out.println("3. 기자이름");
		String inputReporter = input.nextLine();
		
		newsvo = new NewsVO();
		newsvo.setNewsHeadLine(inputNews);
		newsvo.setNewsPress(inputPress);
		newsvo.setReporter(inputReporter);
		
		newsDao.addNewNews(newsvo);
		
	}

}