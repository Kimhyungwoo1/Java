package com.ktds.khw;

public class Main {
	
	public static void main(String[] args) {
		
		OliBank oilBank = new OliBank();
		oilBank.setOilStork(5000);
		oilBank.setBudget(0);
		oilBank.setPricePerLiter(1480);
		
		Car car = new Car("아반떼", 50, 10000000);
		
		System.out.println(oilBank);
		oilBank.filling(car);
		
		System.out.println("=================주유소==================");
		System.out.println(oilBank.getOilStork());
		System.out.println(oilBank.getBudget());
		
		System.out.println("=================자동차==================");
		System.out.println(car.getModelName());
		System.out.println(car.getOilTankVolume());
		System.out.println(car.getOilStock());
		System.out.println(car.getMoney());
		
	}

}
