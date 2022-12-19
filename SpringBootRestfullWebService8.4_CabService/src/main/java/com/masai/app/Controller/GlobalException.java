package com.masai.app.Controller;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.app.Exception.CabException;
import com.masai.app.Exception.ErrorEntity;

import net.bytebuddy.description.modifier.MethodArguments;

@ControllerAdvice
public class GlobalException {

	      @ExceptionHandler(CabException.class)
	      public ResponseEntity<ErrorEntity> getCabException(CabException ce,WebRequest request){
	    	  
	    	  
	    	  ErrorEntity entity=new ErrorEntity(LocalDateTime.now(), ce.getMessage(), request.getDescription(false));
	    	   
	    	  ResponseEntity<ErrorEntity > responseEntity=new ResponseEntity<ErrorEntity>(entity,HttpStatus.BAD_REQUEST);
	    	  return responseEntity;
	      }
	 
	      
	      @ExceptionHandler(NoHandlerFoundException.class)
	      public ResponseEntity<ErrorEntity> getCabException(NoHandlerFoundException e,WebRequest request){
	      	  
	      	  
	      	  ErrorEntity entity=new ErrorEntity(LocalDateTime.now(), e.getMessage(), request.getDescription(false));
	      	   
	      	  ResponseEntity<ErrorEntity > responseEntity=new ResponseEntity<ErrorEntity>(entity,HttpStatus.BAD_REQUEST);
	      	  return responseEntity;
	      }
	      
	      @ExceptionHandler(Exception.class)
	      public ResponseEntity<ErrorEntity> getCabException(Exception e,WebRequest request){
	    	  
	    	  
	    	  ErrorEntity entity=new ErrorEntity(LocalDateTime.now(), e.getMessage(), request.getDescription(false));
	    	   
	    	  ResponseEntity<ErrorEntity > responseEntity=new ResponseEntity<ErrorEntity>(entity,HttpStatus.BAD_REQUEST);
	    	  return responseEntity;
	      }
	      
	      
	      @ExceptionHandler(MethodArgumentNotValidException.class)
	      public ResponseEntity<ErrorEntity> getCabException(MethodArgumentNotValidException e,WebRequest request){
	    	  
	    	  
	    	  ErrorEntity entity=new ErrorEntity(LocalDateTime.now(), e.getMessage(), request.getDescription(false));
	    	   
	    	  ResponseEntity<ErrorEntity > responseEntity=new ResponseEntity<ErrorEntity>(entity,HttpStatus.BAD_REQUEST);
	    	  return responseEntity;
	      }



}
