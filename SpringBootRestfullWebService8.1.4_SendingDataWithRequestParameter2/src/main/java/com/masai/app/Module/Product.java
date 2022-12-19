package com.masai.app.Module;

public class Product {

private Integer  pid;
private String name;
private Integer price;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public Product(Integer pid, String name, Integer price) {
	super();
	this.pid = pid;
	this.name = name;
	this.price = price;
}
public Product() {
	super();
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
}

          
	
	
}
