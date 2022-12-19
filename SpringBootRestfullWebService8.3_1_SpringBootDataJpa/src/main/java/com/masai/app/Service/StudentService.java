package com.masai.app.Service;



import java.util.List;

import com.masai.app.Controller.Exception.StudentNOFoundByGivenIDException;
import com.masai.app.Module.Student;

public interface StudentService {

	// supplied student do not have roll number retrun student with roll number
	public  Student registeredStdent(Student student);
	
	public Student getStudentById(Integer roll) throws StudentNOFoundByGivenIDException;
	
	public List<Student> getAllStudentS()throws StudentNOFoundByGivenIDException;
	

	
	
}
