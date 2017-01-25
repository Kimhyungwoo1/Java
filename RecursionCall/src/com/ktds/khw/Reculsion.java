package com.ktds.khw;

public class Reculsion {
	
	public void call(int index){
		System.out.println("Reculsion.call() 호출 중...." + index);
		
		if( index >= 0 )
			call(--index);
	}

}
