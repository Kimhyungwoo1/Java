package com.ktds.khw.dao;

import java.util.List;

import com.ktds.khw.vo.DepartmentVO;
import com.ktds.khw.vo.LocationVO;

public interface DepartmentDao {
	
	public List<DepartmentVO> departementList();
	
	public List<LocationVO> locationList();

}
