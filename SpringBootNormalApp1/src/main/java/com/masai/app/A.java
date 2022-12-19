package com.masai.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	 @Autowired 
	 public B b;
	 
	 
	public  void showA1() {
	 
		System.out.println("I AM INSIDE THE ShowA1() in the A class");
		b.showB();
		 
		 
		 
	}
	
	
	public  void showA() {
		System.out.println("I am come From Kalyan....");
		System.err.println("I AM Inside the ShowA()  Method OF The A class");
		
		
	}
	  
}
