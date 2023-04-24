package edu.learning.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

/*Hibernate: create table employee (email varchar(255) not null, 
		conact varchar(255), 
		id integer not null, 
		name varchar(255), 
		primary key (email))*/

@Entity
public class Employee {
	private int id;
	private String name;
	@Id
	private String email;
	private String conact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConact() {
		return conact;
	}
	public void setConact(String conact) {
		this.conact = conact;
	}
}
