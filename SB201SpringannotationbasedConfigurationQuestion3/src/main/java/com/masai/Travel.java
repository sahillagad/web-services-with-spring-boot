package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Travel {

	  @Autowired 
	 private Vehical car;
	  
	  @Autowired
	  private Vehical bike;
	  
	  
	  
	  public void showTravel() {
		  
		  System.out.println("Start Journy With ");
		  System.out.println("Car "+car);
		  System.out.println("Bike "+bike);
		  
		  System.out.println("-------------------------------------------");
		  
		  bike.Go();
		  car.Go();
		  
		  
		  
	  }
}
