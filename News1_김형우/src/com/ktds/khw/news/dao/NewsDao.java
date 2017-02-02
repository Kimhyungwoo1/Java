package com.ktds.khw.news.dao;

import java.util.List;

import com.ktds.khw.news.vo.NewsVO;

public interface NewsDao {

	public List<NewsVO> queryAllNews();

	public void addNewNews(NewsVO newNews);

}
