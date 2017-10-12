package com.emids.Domain;

public class Customer {
	private String name;
	private String address;
	private String state;
	private String city;
	private String zip;
	private String number;

	// default constructor
	public Customer() {

	}

	// parameterize constructor
	public Customer(String name, String address, String state, String city, String zip, String number) {
		this.name = name;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.number = number;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return name + " " + address + " " + state + " " + city + " " + zip + " " + number;
	}

}
