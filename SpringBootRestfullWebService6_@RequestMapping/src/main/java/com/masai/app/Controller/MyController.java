package com.masai.app.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Controller")
public class MyController {

//	http://localhost:8888/GETMessage
	@RequestMapping("/GETMessage")
	public String getString() {
		
		return "Welcome To India";
	}
	
	
	
	
}
