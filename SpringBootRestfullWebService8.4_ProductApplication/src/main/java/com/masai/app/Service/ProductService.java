package com.masai.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.app.Exception.ProductException;
import com.masai.app.Module.Product;

@Service
public interface ProductService {

	public Product insertProduct(Product product);
	public Product findProduct(Integer productId) throws ProductException;
	public List<Product> getAllProduct();
}
