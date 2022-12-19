package com.masai.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.Module.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	
}
