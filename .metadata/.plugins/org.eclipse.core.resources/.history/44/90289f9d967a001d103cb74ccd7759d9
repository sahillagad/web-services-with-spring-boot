package com.masai.app.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;

@RestController
public class MyController {

	
	 @RequestMapping("/GETALLStudent")
	 public List<Student> getAllStudent(){
		 
		 List<Student> list=new ArrayList<>();
		 list.add(new Student(10, "Sahil", 344));
		 list.add(new Student(11, "Ram", 644));
		 list.add(new Student(12, "Rani", 974));
		 list.add(new Student(13, "Rajl", 354));
		 return list;
	 }
}

