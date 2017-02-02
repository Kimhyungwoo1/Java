package com.ktds.khw.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public void start() {
		
		//배열 만드는 방법
		int[] scoreArray = new int [4];
		
		//List 만드는 방법 //<> 의 의미는 Referense 타입만 들어올수있고 어떤 형이 들어올껀지 지정해주는 명령어
		List<Integer> scoreList = new ArrayList<Integer>();
		
		//배열에 데이터 를 넣는 방법
		scoreArray[0] = 100;
		scoreArray[1] = 90;
		scoreArray[2] = 80;
		scoreArray[3] = 70;
		
		//List에 데이터를 넣는 방법
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);
		
		//배열 데이터를 출력하는 방법
		//1. for
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println("scoreArray[i]");
		}
		//2 foe-each
		for( int score : scoreArray ) {
			System.out.println(score);
		}
		
		//List 데이터 출력하는 방법
		//1. for
		for ( int i = 0; i < scoreList.size(); i++) {
			System.out.println( scoreList.get(i));
		}
		//2. for-each
		for ( int score : scoreList ) {
			System.out.println(score);
		}
		
		//배열 데이터 수정하기
		scoreArray[1] = 10;  // 1번 인덱스를 10으로 변경
		
		//List 데이터 수정하기
		scoreList.set(1, 10); // 1번 인덱스를 10으로 변경
		
		//배열 데이터 삭제하기
		//불가능..
		
		//List 데이터 삭제하기
		scoreList.remove(1); //1번 인덱스를 삭제함
		
		//배열 데이터 검색하기 
		for ( int i = 0; i < scoreArray.length; i++ ) {
			if ( scoreArray[i] == 80 ){
				System.out.println("scoreArray에 80은 " + i + "번 인덱스에 있습니다.");
			}
		}
		
		//List 데이터 검색하기
		if( scoreList.contains(80) ) {
			System.out.println("scoreList에 80은 " + scoreList.indexOf(80) + "번 인덱스에 있습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		new ArrayListTest().start();
	}

}
