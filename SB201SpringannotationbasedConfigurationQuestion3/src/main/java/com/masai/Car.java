package com.masai;

import org.springframework.stereotype.Service;

@Service
public class Car implements Vehical {

	 public void StartCar() {
		 
		 System.out.println("Car is Start....");
		 
		 
	 }

	@Override
	public void Go() {
     
		StartCar();
		
	}

}
