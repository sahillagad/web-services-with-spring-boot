package com.masai.app.Module;

public class StudentDTO {

	
	private  Integer roll;
	private String  name ;
	public StudentDTO(Integer roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public StudentDTO() {
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "StudentDTO [roll=" + roll + ", name=" + name + "]";
	}
	
	
	
}
