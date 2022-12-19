package com.masai.app.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;

@RestController
public class MyController {


	 List<Student> list=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		
		list.add(new Student(10, "Sahill", 679));
		list.add(new Student(11, "Ram", 679));
		list.add(new Student(12, "Raj", 679));
		list.add(new Student(13, "Manasi", 679));
		list.add(new Student(14, "Pramila", 679));
		
	}
	
	 
	 

	@RequestMapping("/Student")
	 public List<Student> GetAllStudent() {
		
		 return list;
	}
	
	@RequestMapping("/Student/{r}")
	public Student getStudentByRoll(@PathVariable("r") Integer roll) {
		Student student=null;
		
		for(Student stu:list) {
			
			if(stu.getRollNo()==roll) {
				
				student=stu;
				
			}
			
		}
		
		return student;
	}

	
	@RequestMapping("/Student/{r}/{n}/{m}")
    public List<Student> AddStudent(@PathVariable("r")Integer roll,@PathVariable("n") String name ,@PathVariable("m") Integer marks )	{
		
     Student student=new Student(roll, name, marks);
     list.add(student);
		
     return list; 
	}
	
	
	
	@PostMapping("/Student/{r}")
	public Student  getStudent(@PathVariable("r") Integer roll) {
		
		
		Student student=null;
		
		for(Student stu:list) {
			
			if(stu.getRollNo()==roll) {
				
				student=stu;
				
			}
			
		}
		
		return student;
		
	}
	
	

	
}
