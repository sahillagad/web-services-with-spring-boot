package com.masai.app.Exception;

import java.time.LocalDateTime;

public class ErrorEntity {
 
	private LocalDateTime timesDateTime;
	private String message;
	private String description;
	public ErrorEntity(LocalDateTime timesDateTime, String message, String description) {
		super();
		this.timesDateTime = timesDateTime;
		this.message = message;
		this.description = description;
	}
	public LocalDateTime getTimesDateTime() {
		return timesDateTime;
	}
	public void setTimesDateTime(LocalDateTime timesDateTime) {
		this.timesDateTime = timesDateTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ErrorEntity [timesDateTime=" + timesDateTime + ", message=" + message + ", description=" + description
				+ "]";
	}
	
	
	
	 
	 
}
