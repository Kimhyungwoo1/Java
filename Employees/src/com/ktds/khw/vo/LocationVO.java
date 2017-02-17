package com.ktds.khw.vo;

public class LocationVO {

	private int locationId;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProbince;
	private char countryId;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProbince() {
		return stateProbince;
	}

	public void setStateProbince(String stateProbince) {
		this.stateProbince = stateProbince;
	}

	public char getCountryId() {
		return countryId;
	}

	public void setCountryId(char countryId) {
		this.countryId = countryId;
	}

}
