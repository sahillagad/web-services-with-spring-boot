package com.masai.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootNormalApp1Application {

	public static void main(String[] args) {

		ApplicationContext ap= SpringApplication.run(SpringBootNormalApp1Application.class, args);
	     A a=(A) ap.getBean("a");
	     A a1=(A) ap.getBean("a");
	    a.showA();
	    System.out.println("A OBJECT Address "+a);
	     
	    System.out.println(a==a1); 
	    
	    
	    
	    
	    System.out.println("------------------------------------------------------"); 
	   
	    System.out.println("B CLASS OBJECT : "+a.b); 
	    
	    a.showA1();
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
