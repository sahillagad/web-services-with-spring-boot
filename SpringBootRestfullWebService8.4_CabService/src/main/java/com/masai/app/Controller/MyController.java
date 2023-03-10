package com.masai.app.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Exception.CabException;
import com.masai.app.Module.Cab;
import com.masai.app.service.CabService;

@RestController
public class MyController {

	
	 @Autowired
	 public CabService cabService;
	 
	 @PostMapping("/Cabs")
	 public ResponseEntity<Cab> insertCabHandler(@Valid @RequestBody Cab cab) throws CabException{
		 Cab cab2=  cabService.insertCab(cab);
		 return new  ResponseEntity<Cab>(cab2,HttpStatus.CREATED);
	 }
	 
	 
	 @PutMapping("/Cabs")
	 public ResponseEntity<Cab> updateCabHandler(@Valid @RequestBody Cab cab ) throws CabException{
           Cab cab2=  cabService.updateCab(cab); 
		 return new  ResponseEntity<Cab>(cab2,HttpStatus.OK);
	 }
	 
	 
	 @DeleteMapping("/Cabs/{cabid}")
		public ResponseEntity<Cab> deleteCab(@PathVariable("cabid") Integer cabid) throws CabException{
		 
		  Cab cab2=cabService.deleteCab(cabid);
		
		  return new  ResponseEntity<Cab>(cab2,HttpStatus.OK); 
	 }
	 
	 @GetMapping("/Cars/{carType}")
		public ResponseEntity<List<Cab>> viewCabOftype(@PathVariable("carType") String cartype) throws CabException {
			
		 List<Cab>  cabs=cabService.viewCabOftype(cartype);
		 return new ResponseEntity<List<Cab>>(cabs,HttpStatus.OK);
		 
	 }
	 
	 	@GetMapping("/CarsCount/{carType}")
		public ResponseEntity<Integer> countCabsofType(@PathVariable("carType")  String cartype) throws CabException {
	 		Integer count=cabService.countCabsofType(cartype);
	 		return new ResponseEntity<Integer>(count,HttpStatus.OK);
	 	}
	 
	 }
