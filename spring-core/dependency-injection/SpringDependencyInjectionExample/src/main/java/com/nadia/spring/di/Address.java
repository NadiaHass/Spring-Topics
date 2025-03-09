package com.nadia.spring.di;

// if we use component here Spring will automatically detect beans 
// without manually defining them in a @Configuration class

// @Component

public class Address {
	private String city;
	private String state;
	private String country;
	
//	and we initialize the attributes here
//    private String city = "Montreuil";
//    private String state = "Paris";
//    private String country = "France";

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
