package com.ktds.khw.vo;

public class DepartmentVO {

	private int departmentId;
	private String departmentName;
	private int managerId;
	private int locationId;
	
	private LocationVO locationVO;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public LocationVO getLocationVO() {
		if( locationVO == null ){
			locationVO = new LocationVO();
		}
		return locationVO;
	}

	public void setLocationVO(LocationVO locationVO) {
		this.locationVO = locationVO;
	}
	
}
