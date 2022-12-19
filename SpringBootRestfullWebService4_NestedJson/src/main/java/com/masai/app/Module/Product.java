package com.masai.app.Module;

public class Product {

	private String nameProduct;
	private int productId;
	private int price;
	private Address mfgAdd;
	public Product(String nameProduct, int productId, int price, Address mfgAdd) {
		super();
		this.nameProduct = nameProduct;
		this.productId = productId;
		this.price = price;
		this.mfgAdd = mfgAdd;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Address getMfgAdd() {
		return mfgAdd;
	}
	public void setMfgAdd(Address mfgAdd) {
		this.mfgAdd = mfgAdd;
	}
	@Override
	public String toString() {
		return "Product [nameProduct=" + nameProduct + ", productId=" + productId + ", price=" + price + ", mfgAdd="
				+ mfgAdd + "]";
	}
	
	
	
	
	
	
	
}
