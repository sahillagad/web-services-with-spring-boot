package com.masai.app.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Product;

@RestController
@RequestMapping("/MyController")
public class MyController {

	List<Product> list=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		list.add(new Product(1,"Pen", 200));
		list.add(new Product(2,"car", 240));
		list.add(new Product(3, "Food", 345));
		list.add(new Product(4,"FootWear", 450));
		
	}
	
	@RequestMapping("/GetAllProduct")
	public  List<Product>  getAllProduct(){
		return list;
	}
	
	
	
	@RequestMapping("/GetProductById/{Id}")
	public Product getProduct(@PathVariable("Id") Integer id ) {
		Product product=null;
		for(Product pro:list) {
			
			if(pro.getProductId()==id) {
				
				product=pro;
				
			}
		}
		return product;
	}
 	
	
}
