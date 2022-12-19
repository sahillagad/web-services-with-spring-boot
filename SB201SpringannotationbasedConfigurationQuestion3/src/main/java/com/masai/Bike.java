package com.masai;

import org.springframework.stereotype.Service;

@Service
public class Bike implements Vehical {
 
	 
            	 public void StartBike() {
            		 
            		 System.out.println("Bike is Strat...");
            		 
            		 
            	 }

				@Override
				public void Go() {
                 
					StartBike();
					
				}
	 
	  
	
	
}
