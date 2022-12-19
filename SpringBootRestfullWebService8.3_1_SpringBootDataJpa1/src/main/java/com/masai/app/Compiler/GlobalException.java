package com.masai.app.Compiler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.masai.app.Module.*;

@ControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(StudentEx )
public ResponseEntity<ErrorEntity> exception1(){
	
}
}
