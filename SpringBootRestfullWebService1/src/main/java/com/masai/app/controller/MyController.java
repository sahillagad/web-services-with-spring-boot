package com.masai.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	

	@RequestMapping("/welcome")
	@ResponseBody
	public String getMessage() {
		
		return "Welcome TO  India....";
		
		
		
	}
	
	
	@RequestMapping("/Car")
	@ResponseBody
	public String getStartCar() {
		
		return "Car is started...";
	}
	
	
	@RequestMapping("/Student")
	@ResponseBody
	public String getStudent() {
		
		return "Student Name  : Sahil \n"
				+ " Student Marks : 567\n"
				+ "Student Roll     : 77";		
	}
	
}
