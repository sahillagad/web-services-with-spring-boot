package com.masai.app.Module;

public class Car {

	private String carNumber;
	private String carBrand;
	private Integer price;
	public Car(String carNumber, String carBrand, Integer price) {
		super();
		this.carNumber = carNumber;
		this.carBrand = carBrand;
		this.price = price;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carBrand=" + carBrand + ", price=" + price + "]";
	}
}
