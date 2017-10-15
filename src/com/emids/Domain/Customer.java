package com.emids.Domain;

public class Customer {
	private String name;
	private String address;
	private String state;
	private String city;
	private long zip;
	private long number;

	// default constructor
	public Customer() {

	}

	// parameterize constructor
	public Customer(String name, String address, String state, String city, long zip, long number) {
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

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return name + " " + address + " " + state + " " + city + " " + zip + " " + number;
	}

}
