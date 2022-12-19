package com.masai.app.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;

@RestController
public class MyController {

	
	@RequestMapping("/Student/{Roll}/{Name}/{Marks}")
	public Student createStudent(@PathVariable("Roll") Integer roll,@PathVariable("Name") String name,@PathVariable("Marks")int marks) {
		
		
		Student student=new Student(roll, name,marks);
		return student;
	}

	
	
}
