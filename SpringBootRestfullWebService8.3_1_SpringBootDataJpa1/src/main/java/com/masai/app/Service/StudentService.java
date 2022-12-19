package com.masai.app.Service;

import com.masai.app.Compiler.SudentException;
import com.masai.app.Module.Student;

public interface StudentService {

	public Student registeredStudent(Student student);
	public Student getStudentById(Integer roll) throws SudentException;
	
	
	
}
