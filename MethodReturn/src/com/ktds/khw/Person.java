package com.ktds.khw;

public class Person {
	
	private String name;
	private String job;
	
	/**
	 * 기본 생성자
	 * Default Constructor
	 * 맴버변수 값 초기화
	 * 
	 */
	
	public Person() {
		System.out.println("Person 기본 생성자 샐행됨");
	}
	
	/**
	 * 생성자 오버로딩
	 * 기본 생성자에 파라미터를 추가해 데이터를 초기화 시킨다.
	 * @param name
	 * @param job
	 */
	public Person(String name, String job) {
		System.out.println("Person 생성자 실행됨!");
		setName(name);
		setJob(job);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setJob(String job){
		this.job = job;
	}
	
	/*
	 * public 가져올_맴버변수타입 set가져올_명(){
	 * 		return 가져올_맴버변수;
	 * 
	 * }
	 */
	public String getName() {
		return this.name;
		
	}
	
	public String getjob() {
		return this.job;
	}
	
	public void introduce(){
		String message = String.format("이름 : %s , 직업 : %s ", name, job );
		System.out.println(message);
		
	}

}
