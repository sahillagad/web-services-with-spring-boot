package com.masai.app.Repository;

import org.springframework.stereotype.Repository;

import com.masai.app.Module.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

@Repository //Optional
public interface StudentRepo extends JpaRepository<Student,Integer> {
	
	 
	       

}
