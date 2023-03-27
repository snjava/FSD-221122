package com.task.dto;

// DTO (Data Transfer Object)
public class Task {
	private int id;
	private String title;
	private String details;
	private String schedt;
	private String upddt;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getSchedt() {
		return schedt;
	}
	public void setSchedt(String schedt) {
		this.schedt = schedt;
	}
	public String getUpddt() {
		return upddt;
	}
	public void setUpddt(String upddt) {
		this.upddt = upddt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
