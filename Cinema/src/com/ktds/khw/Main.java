package com.ktds.khw;

public class Main {
	
	public void Start(){
		CinemaMachine cinemaMachine = new CinemaMachine();
		Human human = new Human();
		cinemaMachine.reservasionDisplay(human);
	}
	
	public static void main(String[] args) {
		new Main().Start();
	}

}
