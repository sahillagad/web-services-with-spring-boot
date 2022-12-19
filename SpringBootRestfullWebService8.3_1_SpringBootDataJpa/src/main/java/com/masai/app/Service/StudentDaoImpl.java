package com.masai.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired
;
import org.springframework.stereotype.Service;

import com.masai.app.Controller.Exception.StudentNOFoundByGivenIDException;
import com.masai.app.Module.Student;
import com.masai.app.Repository.StudentRepo;

@Service
public class StudentDaoImpl implements StudentService{


	@Autowired
	private StudentRepo sRemo;


	@Override
	public Student registeredStdent(Student student) {
	 	
		Student student2= sRemo.save(student);
		
		return student2;
	}


	@Override
	public Student getStudentById(Integer roll) throws StudentNOFoundByGivenIDException {
	          
		Optional<Student > opt= sRemo.findById(roll);
		
		if(opt.isPresent()) {
		Student student2=opt.get();
		return student2;
		}
		else {
			StudentNOFoundByGivenIDException byGivenIDException=new StudentNOFoundByGivenIDException("Student is not Fount....");
			throw byGivenIDException;
		}
	}


	@Override
	public List<Student> getAllStudentS() throws StudentNOFoundByGivenIDException {
           
      List<Student> list=sRemo.findAll();
 	 
      if(list.size()==0) {
    	  	  throw new StudentNOFoundByGivenIDException("Student database is empty...");
      }
     
      else {
    	  
    	  return list;
      }
      
	}
	
     
	 
	


}
