package com.masai.app.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;

@RestController
public class Mycontroller {

//	http://localhost:8888/student
	@RequestMapping("/student")
	public Student getStudent() {
		
		
		return new Student(1,"Sahil", 560);
		
	}
	 
	
}
