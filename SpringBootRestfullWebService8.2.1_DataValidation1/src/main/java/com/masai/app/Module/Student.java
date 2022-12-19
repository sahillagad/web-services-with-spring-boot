package com.masai.app.Module;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Student {

	 @Min(value = 100 ,message = "{roll.invalid}")
	 private Integer roll; 
	 
	 @Size(min = 3,max = 5,message = "{name.invalid}")
	 private String name;
	 
	 @Max(value = 1000,message = "Mark Must Be Less than 1000")
	 @NonNull
	 private Integer marks;
	 
	public Student(Integer roll, String name, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
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
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	 
	 
	 
	
	
}
