package com.masai.app.Module;

import java.time.LocalDateTime;

public class ErrorEntity {


	private LocalDateTime dateTime;
	private String message;
	private String description;
	public ErrorEntity(LocalDateTime dateTime, String message, String description) {
		super();
		this.dateTime = dateTime;
		this.message = message;
		this.description = description;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
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
		return "ErrorEntity [dateTime=" + dateTime + ", message=" + message + ", description=" + description + "]";
	}	
}
