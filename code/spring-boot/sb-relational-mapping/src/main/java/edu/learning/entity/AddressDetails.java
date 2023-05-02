package edu.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "add_dtls")
@Entity
public class AddressDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String city;
	private String pincode;
	private String state;
	@JoinColumn(name = "empid")
	@OneToOne
	private EmployeeDetails empdetails;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public EmployeeDetails getEmpdetails() {
		return empdetails;
	}
	public void setEmpdetails(EmployeeDetails empdetails) {
		this.empdetails = empdetails;
	}
	
}
