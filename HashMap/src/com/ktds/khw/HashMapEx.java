package com.ktds.khw;

import java.util.HashMap;
import java.util.Map;


public class HashMapEx {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("banana", "바나나");
		map.put("apple", "사과");
		
		String korean = map.get("apple");
		System.out.println(korean);
		
		map.remove("banana");
		
	}

}
