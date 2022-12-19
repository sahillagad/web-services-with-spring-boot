package com.masai.app.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Exception.ProductException;
import com.masai.app.Module.Product;
import com.masai.app.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
   @PostMapping("/Products")
	public ResponseEntity<Product> insertProduct(@RequestBody Product product){
	
	  Product product2= productService.insertProduct(product);
	   
	   return new ResponseEntity<Product>(product2,HttpStatus.ACCEPTED);
   }

	
	
	@GetMapping("/Products/{productId}")
	public ResponseEntity<Product> findProduct(@PathVariable("productId") Integer productId) throws ProductException {
		  Product product2= productService.findProduct(productId);
		   return new ResponseEntity<Product>(product2,HttpStatus.ACCEPTED);		
	}


	@GetMapping("/Products/{productId}")
	public ResponseEntity<List<Product>> getAllProduct(){
		  List<Product> product= productService.getAllProduct();
				  
		  return new ResponseEntity<List<Product>>(product,HttpStatus.ACCEPTED);	
	}
	
	
}
