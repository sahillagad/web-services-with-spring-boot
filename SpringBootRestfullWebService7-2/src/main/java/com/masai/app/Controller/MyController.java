package com.masai.app.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;

@RestController
public class MyController {

	
	
	@RequestMapping("/students")
	public Student  getStudentHandler() {
		
		Student student=new Student(1, "Sahil", 568);
		
		return student;
	}
	
	
	@RequestMapping("/AddStudent/{r}/{n}/{m}")
	public Student getALLStudent(@PathVariable("r") Integer roll ,@PathVariable("n") String name,@PathVariable("m") Integer marks) {
		
	
		return new Student(roll, name, marks);
	}
	
	
	@GetMapping("/GetStudent/{roll}")
	public Student getStudentBYRoll(@PathVariable("roll")Integer roll ) {
		
		
		return new Student(roll,"Sahil", 456);
		
	}
	
	
}
