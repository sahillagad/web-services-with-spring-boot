package com.masai.app.Module;

public class Address {

	private String cities;
	private String states;
	private String pincode;
	public Address(String cities, String states, String pincode) {
		super();
		this.cities = cities;
		this.states = states;
		this.pincode = pincode;
	}
	public String getCities() {
		return cities;
	}
	public void setCities(String cities) {
		this.cities = cities;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [cities=" + cities + ", states=" + states + ", pincode=" + pincode + "]";
	}
	
	
	
}
