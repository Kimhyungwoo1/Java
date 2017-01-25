package com.ktds.khw;

public class OliBank {

	private int oilStork;
	private int pricePerLiter;
	private int budget;

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getBudget() {
		return budget;
	}

	public void setOilStork(int oilStork) {
		this.oilStork = oilStork;
	}

	public int getOilStork() {
		return oilStork;
	}

	public void setPricePerLiter(int pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}

	public int getPricePerLiter() {
		return pricePerLiter;
	}

	public void filling(Car car) {
		this.oilStork -= car.getOilTankVolume();
		
		System.out.println(this);
		car.fillOil(this);
		
		this. budget += (pricePerLiter * car.getOilTankVolume());
	}

}
