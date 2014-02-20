package com.kenny.demoapp.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String street;
	private String houseNumber;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	

}
