package com.masai.app.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.Compiler.SudentException;
import com.masai.app.Module.Student;
import com.masai.app.Repository.StudentRepo;

public class StudentDaoImpl  implements StudentService{
	
	
	@Autowired
	public  StudentRepo repo;

	@Override
	public Student registeredStudent(Student student) {
	       
		Student student2=repo.save(student);
	 return student2;
	}

	@Override
	public Student getStudentById(Integer roll) throws SudentException {
	    
		Optional<Student>   opt=repo.findById(roll);
		
		if(opt.isPresent()) {
			
			Student student=opt.get();
			return student;	
		}
		else {
			
			SudentException se=new SudentException("Studentt is NoT available..");
			throw se;
		}
		
		
	}
	
	

}
