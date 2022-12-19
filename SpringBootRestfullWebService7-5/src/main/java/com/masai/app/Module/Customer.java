package com.masai.app.Module;


public class Customer {

 
	   private Integer  Cid;
	   private String name;
	   private Integer marks;
	public Customer(int cid, String name, int marks) {
		super();
		Cid = cid;
		this.name = name;
		this.marks = marks;
	}
	
	public Customer() {
		super();
	}

	public int getCid() {
		return Cid;
	}
	public void setCid(Integer cid) {
		Cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", name=" + name + ", marks=" + marks + "]";
	}
	   
}
