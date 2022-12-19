package com.masai.app.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	    
	@ExceptionHandler(IllegalArgumentException.class)
   public  ResponseEntity<String> getExceptionHandle(IllegalArgumentException e){
		
		
	 return new 	ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST); 
		
		
	}
 	
	
	   @GetMapping("/hello/{id}")
	     public ResponseEntity<String> sayHello(@PathVariable("id") Integer id) {
	    	 
		   
		   HttpHeaders headers=new HttpHeaders();
		   headers.add("User", "Sahil");
		   headers.add("Admin", "Ratan");
		   headers.add("Phone", "9876544321");
		   
		   
		   if(id>10) {
			   
			   return new  ResponseEntity<String>("Welcome To Spring Boot ",headers,HttpStatus.OK);
		   }
		   else {
			   
			   throw new IllegalArgumentException("Invalid Id Value....");
			   
		   }
		   
	     }
	

	    
	
}
