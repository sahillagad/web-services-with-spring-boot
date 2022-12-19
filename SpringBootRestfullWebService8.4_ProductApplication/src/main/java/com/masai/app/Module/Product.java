package com.masai.app.Module;

import java.time.LocalDateTime;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

@Entity
public class Product {

	
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer productId;
	@NotNull
	private String name;
	
	@NotNull
	private  Double price;
	
	@Past
	private LocalDateTime dateMFG;
	
	@Future 
	private LocalDateTime dateExpiry;

	public Product(Integer productId, @NotNull String name, @NotNull Double price, @Past LocalDateTime dateMFG,
			@Future LocalDateTime dateExpiry) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.dateMFG = dateMFG;
		this.dateExpiry = dateExpiry;
	}

	public Product() {
		super();
	}

	public Product(@NotNull String name, @NotNull Double price, @Past LocalDateTime dateMFG,
			@Future LocalDateTime dateExpiry) {
		super();
		this.name = name;
		this.price = price;
		this.dateMFG = dateMFG;
		this.dateExpiry = dateExpiry;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDateTime getDateMFG() {
		return dateMFG;
	}

	public void setDateMFG(LocalDateTime dateMFG) {
		this.dateMFG = dateMFG;
	}

	public LocalDateTime getDateExpiry() {
		return dateExpiry;
	}

	public void setDateExpiry(LocalDateTime dateExpiry) {
		this.dateExpiry = dateExpiry;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", dateMFG=" + dateMFG
				+ ", dateExpiry=" + dateExpiry + "]";
	}
}
