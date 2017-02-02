package com.ktds.khw;

public class Main {

	public void Start() {

		ReservasionMachine reservasionMachine = new ReservasionMachine();
		Human human = new Human();
		reservasionMachine.reservasionDisplay(human);

	}

	public static void main(String[] args) {

		new Main().Start();
	}

}