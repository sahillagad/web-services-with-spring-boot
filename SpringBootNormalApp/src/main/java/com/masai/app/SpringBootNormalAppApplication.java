package com.masai.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.home.B;

@SpringBootApplication
@ComponentScan(basePackages = "com.home")
public class SpringBootNormalAppApplication {

	public static void main(String[] args) {

		// static method  it will return application context
	 ApplicationContext ap=	SpringApplication.run(SpringBootNormalAppApplication.class, args);
	
	 B  b=(B)ap.getBean("b");
	
	 b.fun();
	
	
	
	
	}

}
