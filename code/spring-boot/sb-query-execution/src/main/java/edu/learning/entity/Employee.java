package edu.learning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	// PK, auto increment
	@Column(name = "emp_name", length = 50, nullable = false)
	private String name; // emp_name  varchar(50) not null
	@Column(name = "emp_email", length = 200, unique = true)
	private String email; // emp_email varcahr(200), unique
	@Column(name = "exec")
	private double experience; // exec
	@Column(length = 30)
	private String city;  // varchar(30)
	@Column(name = "emp_sal")
	private double salary; // emp_sal
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
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
