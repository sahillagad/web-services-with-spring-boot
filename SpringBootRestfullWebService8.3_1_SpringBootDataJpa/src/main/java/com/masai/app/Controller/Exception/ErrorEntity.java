package com.masai.app.Controller.Exception;

import java.time.LocalDateTime;

public class ErrorEntity {

	
	private LocalDateTime dateTime;
	private String path;
	private String description;
	public ErrorEntity(LocalDateTime dateTime, String path, String description) {
		super();
		this.dateTime = dateTime;
		this.path = path;
		this.description = description;
	}
	public ErrorEntity() {
		super();
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ErrorEntity [dateTime=" + dateTime + ", path=" + path + ", description=" + description + "]";
	} 
	
	
}
