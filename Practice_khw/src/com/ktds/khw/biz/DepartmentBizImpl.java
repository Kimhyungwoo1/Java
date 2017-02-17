package com.ktds.khw.biz;

import java.util.List;

import com.ktds.khw.dao.DepartmentDao;
import com.ktds.khw.dao.DepartmentDaoImpl;
import com.ktds.khw.vo.DepartmentVO;
import com.ktds.khw.vo.LocationVO;

public class DepartmentBizImpl implements DepartmentBiz{
	
	DepartmentDao departmentDao;
	
	public DepartmentBizImpl (){
		departmentDao = new DepartmentDaoImpl();
	}

	@Override
	public void printDepartment() {
		
		List<DepartmentVO> departmentList = departmentDao.departementList();
		
		for(DepartmentVO departmentVO : departmentList) {
			System.out.printf("%d\t  %s\t  %d\t  %d\n"
					, departmentVO.getDepartmentId()
					, departmentVO.getDepartmentName()
					, departmentVO.getManageId()
					, departmentVO.getLocationId());
			
		}
		
		
		
		
		
	}

	@Override
	public void printDepartmentWithLocation() {
		
		List<LocationVO> locationList = departmentDao.locationList();
		
		for ( LocationVO locationVO : locationList ){
			System.out.printf("%s\t %s\t %s\n"
					, locationVO.getCity()
					, locationVO.getDepartmentVO().getDepartmentName()
					, locationVO.getStreetAddress());
		}
		
		
		
	}

}
