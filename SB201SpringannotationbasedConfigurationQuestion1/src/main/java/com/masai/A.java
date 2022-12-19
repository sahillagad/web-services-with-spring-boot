package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	
	 @Autowired
	 public List<String> list;
	 
	 @Autowired
	 public List<Student> students;
	 
	 
	public void showA() {
		
		System.out.println("I AM INSIDE THE SHOWA() METHOD OF A CLASS");
        
		for(String s:list) {
			System.out.println(s);
			
		}
		
		
		
		for(Student stu:students) {
			
			System.out.println(stu);
		}
		
		
	}
	
}
