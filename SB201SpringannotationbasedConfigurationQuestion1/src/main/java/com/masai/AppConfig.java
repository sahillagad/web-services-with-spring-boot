package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {

	          
	@Bean
	public List<String> getStringslList(){
		
		List<String> list=new ArrayList<>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Nashik");
		list.add("Nagpur");
		list.add("Kalyan");
		
		return  list;
		
		
	}
	
	
	
	
	@Bean
	public List<Student>  getStudentsList(){
		
		
		List<Student> students=new  ArrayList<>();
		
		students.add(new Student(1,"s1", 560));
		students.add(new Student(2,"s2", 340));
		students.add(new Student(3,"s3", 547));
		students.add(new Student(4,"s4", 670));
		students.add(new Student(5,"s5", 534));
		students.add(new Student(6,"s6", 400));
		return students;
	}
	
	
	
}
