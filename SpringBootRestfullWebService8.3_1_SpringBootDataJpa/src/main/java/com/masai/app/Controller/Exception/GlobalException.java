package com.masai.app.Controller.Exception;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(StudentNOFoundByGivenIDException.class)
	public ResponseEntity<ErrorEntity> getException1(StudentNOFoundByGivenIDException e,WebRequest request){
		
		
		ErrorEntity entity=new ErrorEntity(LocalDateTime.now(),request.getDescription(false),e.getMessage()); 
		ResponseEntity<ErrorEntity> entity2=new ResponseEntity<ErrorEntity>(entity,HttpStatus.ACCEPTED);
		
		return entity2;
		
	}


}
