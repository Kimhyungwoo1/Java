package com.ktds.mcj.address.book.biz;

import java.util.List;

import com.ktds.mcj.address.book.vo.AddressVO;

public interface AddressBiz {

	/**
	 * 주소록 조회
	 * @return 모든 주소를 반환함
	 */
	public void queryAllList();
	
	/**
	 * 주소 검색
	 * @param index 주소 번호 ( 1, 2, 3, 4...)
	 * @return 하나의 주소를 반환함
	 */
	public void findOneAddress();
	
	/**
	 * 주소 삭제
	 * @param index 삭제할 주소 번호 ( 1, 2, 3, 4...)
	 */
	public void removeAddress();
	
	/**
	 * 주소 수정
	 * @param index 수정할 주소 번호 ( 1, 2, 3, 4...)
	 * @param newAddress 신규 주소 정보
	 */
	public void updateAddress();
	
	/**
	 * 주소 추가
	 * @param newAddress 신규 주소 정보
	 */
	public void addAddress();
}











