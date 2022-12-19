package com.masai.app.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Student;
import com.masai.app.Module.StudentDTO;

@RestController
public class MyController {

	List<Student> students=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		students.add(new Student(10,"Sahil", 456));
		students.add(new Student(12,"Ravi", 756));
		students.add(new Student(13,"Amit", 370));
		students.add(new Student(14,"Rajeev", 654));
		students.add(new Student(15,"Vinay", 759));
		students.add(new Student(16,"Ram", 800));		
		
	}
	
	
	@GetMapping("/Students")
	public List<Student> getAllStudentDetailHandler(){
		return students;
	}
	
	
	@GetMapping("/Students/{roll}")
	public Student getStudent(@PathVariable("roll") Integer Roll) {
		
 		
		List<Student> list=students.stream().filter(t ->{
		boolean b=false;
			if(t.getRoll()==Roll) {
				b=true;
			}
			return b;
		}).collect(Collectors.toList());
		if(list.size()==0) {
			throw new IllegalArgumentException("Student Does NOT Exist With Roll "+Roll);
		}
		else {
		       return list.get(0);  
		}
		
		
	 //2 Way
//		Student student=null;
//		for(Student s:students) {
//			if(s.getRoll()==Roll) {
//				student=s;
//				}}
//		return student;
		
	}
	
	@PostMapping("/Students")
	public String addStudentByHandler(@RequestBody Student student)  {
		
		students.add(student) ;
		String result = student.getName()+" Student is add ";
	
		return result;
	}
 	
	@PutMapping("/Students/{roll}")
	public List<Student> updateEntireDetailOfStudent(@PathVariable("roll") Integer roll ,@RequestBody Student student){
		
		boolean b=false;
		for(Student s:students) {
			
			if(s.getRoll()==roll) {
				s.setName(student.getName());
				s.setMarks(student.getMarks());


				b=true;
				
			}	
			
		}
		
		if(b==false) {
			
			IllegalArgumentException argumentException=new IllegalArgumentException("Student is Not Found By Given Id");
			throw argumentException;
		}
	
		return students;
	}
	
	
	@GetMapping("/getStudent")
	public StudentDTO getStudentDetail1(@RequestParam("Roll") Integer Roll ) {
		StudentDTO st=new StudentDTO();
		
		for(Student s:students) {
			
			if(s.getRoll()==Roll) {
				
				 st.setRoll(Roll);
				st.setName(s.getName());
				
			}
			
		}
		
		return st;
	}
	
	
	
	@DeleteMapping("Student/{Roll}")
	public List<Student> deleteStudent(@PathVariable("Roll")Integer Roll){
		
		boolean b=students.removeIf(t -> {
		Boolean b1=false;
			if(t.getRoll()==Roll) {
				
				b1=true;
				
			}
			return b1;
			
		});		
		
		
		if(b==false) {
			throw new  IllegalArgumentException("Student is not Fund");
			
		}
		else {
			return students;
		}
		
	}
	
	
@PutMapping("/Student/{roll}/{graceMark}")
 public Student getUpadtePartial(@PathVariable("roll") Integer roll ,@PathVariable("graceMark")Integer Mark)	
 {
		
		boolean b=false;
		Student student=null;
		
		for(Student stu: students)
		{
			
			if(stu.getRoll()==roll) {
				
				stu.setMarks(stu.getMarks()+Mark);
				student=stu;
				b=true;
				
			}
			
		}
		
		if(b==false) {
			
			throw new  IllegalArgumentException("Student is Not Found By Given Id");
		}
		return student;
 }
	

@PutMapping("/studentMarkUpadte")
public List<Student> getUpdateStudent(@RequestParam("Roll") Integer roll,
		 @RequestParam("Mark") Integer marks)
{;
	
	for(Student  st:students) {
		
		if(st.getRoll()==roll) {
			
			st.setMarks(st.getMarks()+marks);
			
		}
	}
	
	
	return students;
}


}
