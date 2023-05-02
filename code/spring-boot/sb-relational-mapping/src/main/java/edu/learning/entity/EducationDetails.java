package edu.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "edu_dtls")
public class EducationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String title;
	private double percent;
	private int year;
	@JoinColumn(name = "empid")
	@ManyToOne
	private EmployeeDetails empDetails;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public EmployeeDetails getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}
}
