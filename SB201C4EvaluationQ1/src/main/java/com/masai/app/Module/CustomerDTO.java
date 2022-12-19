package com.masai.app.Module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDTO {
	

	@Id
	private Integer srNo;
	private String name;
	private String  address;
	private Integer age;
	public CustomerDTO(Integer srNo, String name, String address, Integer age) {
		super();
		this.srNo = srNo;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public CustomerDTO() {
		super();
	}
	public Integer getSrNo() {
		return srNo;
	}
	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "CustomerDTO [srNo=" + srNo + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
	
	
}
