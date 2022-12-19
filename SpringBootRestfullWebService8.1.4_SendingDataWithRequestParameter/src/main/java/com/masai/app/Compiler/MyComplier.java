package com.masai.app.Compiler;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;

@RestController
public class MyComplier {

	
	List<Student>  students=new ArrayList<>();
	 
	
	 @PostConstruct
	 public void initMethod(){
		 
		 students.add(new Student(10, "Sahil", 456));
		 students.add(new Student(11, "Ram", 656));
		 students.add(new Student(12, "Rani", 400));
		 students.add(new Student(13,"Pramila", 769));
		 
	 }
	
	@RequestMapping("/Students")
	public Student addStudent(@RequestParam("roll") Integer sroll,@RequestParam("name")String sname,@RequestParam("marks")Integer smarks ) {
 
		Student student=new Student(sroll, sname, smarks);
	 return student;
	}
	
	@RequestMapping("/Student")
	public Student getStudent(@RequestParam("roll") Integer Roll) {
		Student s=null;
		
	for(Student stud:students) {
		
		if(stud.getRoll()==Roll) {
			s=stud;
		}
		
	}
	return s;
		
	}
	
}
