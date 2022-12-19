package com.masai.app.Compiler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;
import com.masai.app.Service.StudentService;

@RestController
public class Mycontroller {

	@Autowired
	 private StudentService service;

	
	@PostMapping("/Students")
	public ResponseEntity<Student> registeredStudent(@RequestBody Student student){
	 Student student2=	service.registeredStudent(student);
	 return new  ResponseEntity<Student>(student2,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/Students/{roll}")
	public ResponseEntity<Student> getStudentById(Integer roll) throws SudentException{

	   Student student=service.getStudentById(roll);
		
	   return new ResponseEntity<Student>(student,HttpStatus.ACCEPTED);
	}
	
	
}
