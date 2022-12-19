package com.masai.app.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.masai.app.Module.ErrorEntity;

@ControllerAdvice
public class GlobalExceptionControl {

	         
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorEntity> getException1(ProductException p,WebRequest request){
		
		ErrorEntity entity=new ErrorEntity(LocalDateTime.now(), p.getMessage(), request.getDescription(false));
        
		ResponseEntity<ErrorEntity> entity2=new ResponseEntity<ErrorEntity>(entity,HttpStatus.ACCEPTED);
		return entity2;
	}
	
	
		    
		@ExceptionHandler(Exception.class)
		public ResponseEntity<ErrorEntity> getException1(Exception e,WebRequest request){
		
		ErrorEntity entity=new ErrorEntity(LocalDateTime.now(), e.getMessage(), request.getDescription(false));
		
		ResponseEntity<ErrorEntity> entity2=new ResponseEntity<ErrorEntity>(entity,HttpStatus.ACCEPTED);
		return entity2;
		}
}
