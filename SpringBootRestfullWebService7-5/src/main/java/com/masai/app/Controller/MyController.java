package com.masai.app.Controller;

import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Customer;




@RestController
public class MyController {


	List<Customer> customers=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		
		customers.add(new Customer(1,"C1", 569));
		customers.add(new Customer(2,"C2", 569));
		customers.add(new Customer(3,"C3", 569));
		customers.add(new Customer(4,"C4", 569));
		customers.add(new Customer(5,"C5", 569));
		customers.add(new Customer(6,"C6", 569));
	
	}
	
	
	@RequestMapping("/customers")
	public List<Customer>  getAllCustomer(){
		
 return customers;
		
	}
	 
	
	@RequestMapping("/Customer")
	public String ceateCustomer(@RequestParam(value = "cid",required =false ) Integer cid ,@RequestParam(value =  "Cname" ,required=false) String name,@RequestParam(value =  "CMarks",required = false) Integer   m) {
	

	return cid+" "+name+" "+m;	
		
		
	}
	
	@RequestMapping("/customer/{cid}")
	public Customer getcustomer(@PathVariable("cid") Integer CID ,@RequestParam(value =  "sName" ,required = false ) String Name ) {
		
		return new Customer(CID, Name, 0);
	}
	

}
