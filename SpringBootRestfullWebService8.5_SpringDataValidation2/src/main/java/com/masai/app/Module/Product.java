package com.masai.app.Module;

public class Product {
         
	 
	private Integer productId;
	private String pName; 
	private Double price;
	private String address;
	
	
	
	
	
	
	

	public Product() {
		super();
	}
	public Product(String pName, Double price, String address) {
		super();
		this.pName = pName;
		this.price = price;
		this.address = address;
	}
	public Product(Integer productId, String pName, Double price, String address) {
		super();
		this.productId = productId;
		this.pName = pName;
		this.price = price;
		this.address = address;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", pName=" + pName + ", price=" + price + ", address=" + address
				+ "]";
	}
	
	
	
	
	            
	 
}
