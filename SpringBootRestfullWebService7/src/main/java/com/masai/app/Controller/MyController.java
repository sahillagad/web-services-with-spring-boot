package com.masai.app.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;

@RestController
@RequestMapping("/myController")
public class MyController {

	List<Student> list=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() 
	{
		
		list.add(new Student(10, "S1", 656));
		list.add(new Student(11, "S2", 656));
		list.add(new Student(12, "S3", 656));
		list.add(new Student(13, "S4", 656));
		
		
	}
	
	
	
	
	@RequestMapping("/Student/{roll}")
     public Student getStudentAccording(@PathVariable("roll") Integer roll) {
		Student student=null;
		for(Student stu:list) {
			
			if(stu.getRoll()==roll) {
				
			 student=stu;
			}
			
		}
	return student;
	}
	 
	
}
