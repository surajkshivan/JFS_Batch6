package com.cg.model;

public class Address {
	private String Street;
	private String City;
	private String State;
	private String Country;
	private int Zip;
	/*public void setStreet(String street) {
		Street = street;
	}
	public void setCity(String city) {
		City = city;
	}
	public void setState(String state) {
		State = state;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public void setZip(int zip) {
		Zip = zip;
	}*/
	public Address(String street, String city, String state, String country, int zip) {
		
		Street = street;
		City = city;
		State = state;
		Country = country;
		Zip = zip;
	}
	
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ", State=" + State + ", Country=" + Country + ", Zip="
				+ Zip + "]";
	}
	

}
