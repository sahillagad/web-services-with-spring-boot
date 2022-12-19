package com.masai.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Controller.Exception.StudentNOFoundByGivenIDException;
import com.masai.app.Module.Student;
import com.masai.app.Service.StudentDaoImpl;
import com.masai.app.Service.StudentService;

@RestController
public class MyController {

 
	@Autowired
   private	StudentService service;
	
	
	@PostMapping("/Students")
	public ResponseEntity<Student> registeredStudentHandler(@RequestBody Student student){
 
		Student student2= service.registeredStdent(student) ;
		
		return new ResponseEntity<Student>(student2,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/Students/{roll}")
	public ResponseEntity<Student> getStudentBYId(@PathVariable("roll") Integer Roll ) throws StudentNOFoundByGivenIDException{
		
		Student student= service.getStudentById(Roll);
		
		if(student==null) {
			
			StudentNOFoundByGivenIDException byGivenIDException=new StudentNOFoundByGivenIDException("Student is Not Found By Given Id");
          throw byGivenIDException;		
		}
		else {
		return 		 new ResponseEntity<Student>(student,HttpStatus.ACCEPTED);
		}
		}
 
	
	
	@GetMapping("Students") 
	public ResponseEntity<List<Student>> getAllStudentHandler() throws StudentNOFoundByGivenIDException{
		
		
		List<Student> list =service.getAllStudentS();
	     
        return new ResponseEntity<List<Student>>(list,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


 