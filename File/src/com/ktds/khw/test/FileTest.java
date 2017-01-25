package com.ktds.khw.test;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		String folderPath = "D:\\Languages";
		
		//folderPath경로를 읽어 온다.
		File languagesFolder = new File( folderPath );
		
		//languageFolder의 경로가 폴더(디렉토리)인지 파일인지 구분한다.
		if( languagesFolder.isDirectory() ) {
			
			System.out.println(languagesFolder.getAbsolutePath() + "는 폴터(디렉토리) 입니다.");
			
		}
		else{
			System.out.println(languagesFolder.getAbsolutePath() + "아닙니다.");
		}
		
		File javafolder = new File(languagesFolder.getAbsolutePath() + File.separator + "Java" );
		if(javafolder.isDirectory()){
			System.out.println(javafolder.getAbsolutePath() + "는 폴더입니다.");
		}
		else{
			System.out.println(javafolder.getAbsolutePath() + "는 파일입니다.");
		}
		// javaFolder 안에 있는 내용물들을 가져온다.
		String[] contents = javafolder.list();
		for ( String content : contents ){
			System.out.println(content);
		}
		
		
	}

}
