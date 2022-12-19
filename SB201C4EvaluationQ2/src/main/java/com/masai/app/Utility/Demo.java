package com.masai.app.Utility;

import javax.persistence.EntityManager;

public class Demo {

	public static void main(String[] args) {
		
   EntityManager em=	EMUTILITY.provideEntityManager();
 System.out.println(em);
	
	}
}
