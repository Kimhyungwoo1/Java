package com.ktds.khw.pccafe;

import com.ktds.khw.AppleComputer;
import com.ktds.khw.Computer;
import com.ktds.khw.LGComputer;
import com.ktds.khw.SamsungComputer;

public class PcCafe {
	
	public static void main(String[] args) {
		
		Computer[] computers = new Computer[5];
		
		computers[0] = new SamsungComputer();
		computers[1] = new LGComputer();
		computers[2] = new SamsungComputer();
		computers[3] = new AppleComputer();
		computers[4] = new LGComputer();
		
		for(Computer computer : computers){
			computer.input();
			computer.compute();
			computer.store();
			if ( computer instanceof AppleComputer) {
				((AppleComputer) computer).faceTime();
			}
		}
	}

}
