package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
		
	 A a=(A)	ap.getBean("a");

	 System.out.println(a);
	a.showA();	
		
		
	}
}
