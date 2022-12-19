package com.masai.app.Module;

public class Student {

	
	private Integer RollNo;
	private String name;
	private Integer marks;
	public Student(Integer rollNo, String name, Integer marks) {
		super();
		RollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public Integer getRollNo() {
		return RollNo;
	}
	public void setRollNo(Integer rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
	
}
