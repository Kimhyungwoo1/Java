package com.ktds.khw;

import com.ktds.khw.buyer.Buyer;
import com.ktds.khw.mashine.Machine;

public class VendingMachine {

	public void start() {

		Buyer buyer = new Buyer(10000, 0);
		Machine machine = new Machine(10000, 10, 10, 10);

		// for (int i = 0; i < 3; i++) {
		buyer.inCoin(machine);
		machine.chooseDrink();
		machine.bye(buyer);

		buyer.inCoin(machine);
		buyer.drinkItem();
		// }
		System.out.println(buyer);
		System.out.println(machine);

	}

	public static void main(String[] args) {
		new VendingMachine().start();
	}

}
