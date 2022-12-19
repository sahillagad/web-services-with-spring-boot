package com.masai.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.Module.Product;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Integer>{
	
	
	
	

}
