package com.masai.app.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Address;
import com.masai.app.Module.Product;
import com.masai.app.Module.Student;

@RestController
public class MyController {

//	http://localhost:8888/getStudent
	 @RequestMapping("/getStudent")
	 public Student getStudent() {
		 
		 Address add=new Address("Mumbai","MH","432563");
		 Student student=new Student("12", "Sahil", 567, add);
		 
		 return student;
		 
	 }
//	 http://localhost:8888/getProduct
	 @RequestMapping("/getProduct")
	 public Product productDetail() {
		 

		 Address add=new Address("Mumbai","MH","432563");
		 Product product=new Product("LUX", 12, 680,add );
		 
		 return product;
	 }
	 

	 
	 
}
