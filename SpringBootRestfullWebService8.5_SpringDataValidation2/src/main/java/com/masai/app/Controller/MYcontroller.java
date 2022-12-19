package com.masai.app.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Product;

@RestController
public class MYcontroller {

	 
	
	 @PostMapping("/Products")
	 public ResponseEntity<String>  addProduct(@RequestBody Product product) {
		 
		 HttpHeaders headers=new HttpHeaders();
		 headers.add("User", "Sahil");
		 headers.add("Admin", "Ratan");
		 
		 
		 
	 return 	new ResponseEntity<String>(product.getpName()+" Product is added ",headers,HttpStatus.ACCEPTED);
		 
	 }
	 
	
	
}
