package com.masai.app.Module;

public class Course {

	
	 private Integer courseId;
	 private String courseName;
	 private Integer fees;
	public Course(Integer courseId, String courseName, Integer fees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + "]";
	}
	 
	 
	  
	 
	
	
}
