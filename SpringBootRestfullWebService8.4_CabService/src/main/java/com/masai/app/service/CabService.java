package com.masai.app.service;

import java.util.List;

import com.masai.app.Exception.CabException;
import com.masai.app.Module.Cab;

public interface CabService {
 
	
	public Cab insertCab(Cab cab)throws CabException;
	
	public Cab updateCab(Cab cab)throws CabException;
	
	public Cab deleteCab(Integer cabid)throws CabException;
	
	public List<Cab> viewCabOftype(String cartype)throws CabException;
	
	public Integer  countCabsofType(String cartype)throws CabException;

	       
	 
	
	
}
