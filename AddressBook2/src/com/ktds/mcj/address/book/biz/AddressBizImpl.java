package com.ktds.mcj.address.book.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.mcj.address.book.doa.AddressDao;
import com.ktds.mcj.address.book.doa.AddressDaoImpl;
import com.ktds.mcj.address.book.vo.AddressVO;

public class AddressBizImpl implements AddressBiz{

	private Scanner input = new Scanner(System.in);
	
	private AddressDao addressDao;
	
	public AddressBizImpl() {
		addressDao = new AddressDaoImpl();
	}
	
	@Override
	public void queryAllList() {
		List<AddressVO> addressList = addressDao.queryAllList();
		for ( AddressVO address : addressList ) {
			printAddressInformation(address);
		}  
	}
	
	private void printAddressInformation(AddressVO address) {
		System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", address.getName(), address.getPhoneNumber(), address.getAddress());
	}

	@Override
	public void findOneAddress() {
		
		int addressNumber = inputAddressNumber();
		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		printAddressInformation(addressVO);
		
	}

	private int inputAddressNumber() {
		System.out.println("주소록의 번호를 입력하세요.");
		int addressNumber = input.nextInt();
		return addressNumber;
	}

	@Override
	public void removeAddress() {
		
		int addressNumber = inputAddressNumber();
		addressDao.removeAddress(addressNumber);
		
	}

	@Override
	public void updateAddress() {
		
		int addressNumber = inputAddressNumber();
		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		printAddressInformation(addressVO);
		
		addressVO = createNewAddress();
		
		addressDao.updateAddress(addressNumber, addressVO);
		
	}

	private AddressVO createNewAddress() {
		AddressVO addressVO;
		System.out.println("새로운 주소 정보를 입력하세요.");
		System.out.println("이름을 입력하세요.");
		String nameTemp = input.next();
		System.out.println("전화번호를 입력하세요.");
		String phoneNumberTemp = input.next();
		System.out.println("주소를 입력하세요.");
		String addressTemp = input.next();
		
		addressVO = new AddressVO();
		addressVO.setName(nameTemp);
		addressVO.setPhoneNumber(phoneNumberTemp);
		addressVO.setAddress(addressTemp);
		return addressVO;
	}

	@Override
	public void addAddress() {
		
		AddressVO addressVO = createNewAddress();
		
		addressDao.addAddress(addressVO);
		
	}
}
	