package com.masai.app.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Course;

@RestController
public class MyController {

	
	List<Course> courses=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		
		courses.add(new Course(1,"Java Full Stack",25000));
		courses.add(new Course(2,"Java Adv",15000));
		courses.add(new Course(3,"Java Core",5000));
		courses.add(new Course(4,"React Js",7000));
		courses.add(new Course(5,"Angular Js",4000));
		
		
	}
	
	
	@GetMapping("/Courses")
	public List<Course> getAllCourse(){
		
		return courses;
	}
	
	@GetMapping("/Courses/{courseId}")
	public Course getCourseById(@PathVariable("courseId")Integer courseId) {
		Course course=null;
		
		 for(Course c:courses) {
			 
			 if(c.getCourseId()==courseId) {
				 
				 course=c;
				 
			 }
			 
		 }
				return course;
	}
	
	@PostMapping("/Courses")
	public String CraeteCourse(@RequestBody Course course) {
		String result="Course Not Add";
		courses.add(course);
		result =course.getCourseName()+" Is Add Successfully....";
     
	
		return result;
		
	}
	
	
	@DeleteMapping("/Courses")
	public String deleteAllCourse() {
 
		String result="Courses is Not delete Successfully...";
		
		
		courses=null;
		result="Courses is delete Successfully..";
		
	 return result;
	}
	
	@DeleteMapping("/Courses/{courseId}")
	public List<Course> courseDelete(@PathVariable("courseId") Integer courseId){
    
	
	 for(int i=0;i<courses.size();i=i+1) {
		 
		 if(courses.get(i).getCourseId()==courseId) {
			 
			courses.get(i);
			 courses.remove(i);
			 
		 }
		 
	 }
	return courses ;
}
	
	@PutMapping("Courses/{courseId}/{fee}")
	public Course UpdateCourseFees(@PathVariable("courseId") Integer courseId ,@PathVariable("fee")Integer fee) {
		
Course course=null;
		 for(int i=0;i<courses.size();i=i+1) {
			 if(courses.get(i).getCourseId()==courseId) {
				courses.get(i).setFees(fee);
           course=courses.get(i);		 
			 }
		 }
		return course;	
	}
}

