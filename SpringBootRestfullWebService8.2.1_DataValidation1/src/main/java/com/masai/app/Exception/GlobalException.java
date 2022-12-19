package com.masai.app.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.masai.app.Module.InvalideDataException;

@ControllerAdvice
public class GlobalException {

	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
   public ResponseEntity<InvalideDataException>  getException(MethodArgumentNotValidException exception,WebRequest request){
		
		InvalideDataException dataException=new InvalideDataException(LocalDateTime.now(), exception.getMessage(), exception.getBindingResult().getFieldError().getDefaultMessage());
		
		ResponseEntity<InvalideDataException> entity=new  ResponseEntity<InvalideDataException>(dataException,HttpStatus.ACCEPTED);
		return entity;
	}
	
	
}
