package com.masai.app.Controller;

import org.springframework.http.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Employee;

@RestController
@RequestMapping("/MyController")
public class MyController {

	
	List<Employee> employees=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		employees.add(new Employee(1,"Sahil", 50000));
		employees.add(new Employee(2,"Ram", 55000));
		employees.add(new Employee(3,"Rani", 45000));
		employees.add(new Employee(4,"Raj", 30000));
		employees.add(new Employee(5,"Pramila", 80000));
	}
	
	
	@RequestMapping(value =  "/GetAllEmployee",produces = MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getAllEmployee(){

		
		return employees;
	}
	
	
	@RequestMapping(value =  "/GetAllEmployee1",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee1(){

		
		return employees;
	}
	
	
	
	@RequestMapping(value =  "/GetAllEmployee2",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee2(){
		return employees;
	}
	
	
	
	
	@GetMapping(value =  "/GetAllEmployee3",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee3(){
		return employees;
 }
	
	@GetMapping(value =  "/GetAllEmployee4")
	public List<Employee> getAllEmployee4(){
		return employees;
 }
	
	
	 
}
