package com.masai.app.Module;

public class Product {

 private	int productId;
 private String productName;
 private int marks;
public Product(int productId, String productName, int marks) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.marks = marks;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", marks=" + marks + "]";
}
 
 
 
}
