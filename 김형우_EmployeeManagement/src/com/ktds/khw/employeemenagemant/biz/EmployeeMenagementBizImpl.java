package com.ktds.khw.employeemenagemant.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.khw.employeemenagemant.EmployeeMenagementRank;
import com.ktds.khw.employeemenagemant.dao.EmployeeMenagementDao;
import com.ktds.khw.employeemenagemant.dao.EmployeeMenagementDaoImpl;
import com.ktds.khw.employeemenagemant.vo.EmployeeMenagementVO;

public class EmployeeMenagementBizImpl implements EmployeeMenagementBiz {

	Scanner input = new Scanner(System.in);

	private EmployeeMenagementDao employeeMenagementDao;

	private List<EmployeeMenagementVO> menagement;

	private EmployeeMenagementRank employeemenagementRank;

	EmployeeMenagementRank employeeMenagementRank = new EmployeeMenagementRank() {
	};

	EmployeeMenagementVO employeeLists = new EmployeeMenagementVO();

	public EmployeeMenagementBizImpl() {
		employeeMenagementDao = new EmployeeMenagementDaoImpl();
	}

	@Override
	public void queryAllList() {
		String position;
		List<EmployeeMenagementVO> employeeList = employeeMenagementDao.queryAllList();

		outputEmployeeList(employeeList);

	}

	private void outputEmployeeList(List<EmployeeMenagementVO> employeeList) {
		
		String position = null;
		for (EmployeeMenagementVO employeeLists : employeeList) {

				if (employeeLists.getPosition() == 100) {
					position = "WORKER";
				}
				else if (employeeLists.getPosition() == 200) {
					position = "DEPUTY";
				}
				else if (employeeLists.getPosition() == 300) {
					position = "CHIEF";
				}
				else if (employeeLists.getPosition() == 400) {
					position = "DEPUTYHEAD";
				}
				else if (employeeLists.getPosition() == 500) {
					position = "DEPARTMENTHEAD";
				}
				else if (employeeLists.getPosition() == 600) {
					position = "CEO";
				}
				else {
					System.out.println("잘못입력하였습니다 다시 입력해 주세요.");
				}
				
			System.out.printf("이름 : %s , 직급 : %s , 연봉 : %d , 부서명 : %s\n", employeeLists.getEmployeeName(), position , employeeLists.getSalary(), employeeLists.getDepartment());
		}
	}

	@Override
	public void addEmployee() {
		EmployeeMenagementVO employeeMenagementVO = add();

		employeeMenagementDao.addEmployee(employeeMenagementVO);

	}

	private EmployeeMenagementVO add() {
		System.out.println("새로운 사원을 입력합니다.");
		System.out.println("1. 직원명 : ");
		String newEmployee = input.next();
		int newPosition = 0;
		while ( true ) {
			System.out.println("2. 직급명 : (사원 : 100, 대리 : 200, 과장 : 300, 차장 : 400, 부장 : 500, 사장 : 600)");
			newPosition = input.nextInt();
			if(newPosition >= 100 && newPosition <= 600 && newPosition % 100 == 0) {
				break;
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		
		System.out.println("3. 연봉 :");
		int newSalary = input.nextInt();
		System.out.println("4. 부서명 :");
		String newDepartment = input.next();

		EmployeeMenagementVO employeeMenagementVO = new EmployeeMenagementVO();
		employeeMenagementVO.setEmployeeName(newEmployee);
		employeeMenagementVO.setPosition(newPosition);
		employeeMenagementVO.setSalary(newSalary);
		employeeMenagementVO.setDepartment(newDepartment);
		return employeeMenagementVO;
	}

	@Override
	public void removeEmployee() {

		List<EmployeeMenagementVO> employeeList = employeeMenagementDao.queryAllList();
		outputEmployeeList(employeeList);

		System.out.println("직원 번호를 입려하세요.");
		int employeeNumber = input.nextInt();
		employeeMenagementDao.removeEmployee(employeeNumber);
		System.out.println("완료되었습니다!");
	}

	@Override
	public void updateEmployee() {


		EmployeeMenagementVO employeeMenagementVO = new EmployeeMenagementVO();

		List<EmployeeMenagementVO> employeeList = employeeMenagementDao.queryAllList();
		outputEmployeeList(employeeList);

		System.out.println("직급을 수정할 직원 번호를 입력하세요.");
		int employeeNumber = input.nextInt();

		employeeMenagementVO = employeeList.get(employeeNumber);
		System.out.println("2. 직급명 : (사원 : 100, 대리 : 200, 과장 : 300, 차장 : 400, 부장 : 500, 사장 : 600)");
		employeeMenagementVO.setPosition(input.nextInt());

	}

}
