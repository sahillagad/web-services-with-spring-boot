package com.masai.app.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


	@RequestMapping("/welcome")
	public String myWelocme() {
		
		return "welocme to india";
		
	}
	
	
	
	
	@RequestMapping("/hello")
	public String getHello() {
		
		return "Hello MR Sahil";
	}
	
	 
}
