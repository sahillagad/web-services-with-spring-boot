package com.masai.app.Module;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.repository.query.parser.Part.IgnoreCaseType;



@Entity
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
	
	@NotNull
	private String licenceNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cab cab;
	
	@NotNull
	private float rating;

	
	
	 
}
