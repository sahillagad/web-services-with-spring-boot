package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	
	public static void main(String[] args) {
		
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfi.class);
		Travel t1=(Travel) ap.getBean("travel");
		
		t1.showTravel();
		
		
		
	}
}
