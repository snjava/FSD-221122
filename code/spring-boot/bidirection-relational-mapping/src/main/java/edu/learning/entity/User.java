package edu.learning.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class User {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int uid;
	private String name;
	private String email;
	
	@JsonManagedReference // Has to use into parent table
	@OneToMany(mappedBy = "user")
	private List<Cart> products;
	
	public List<Cart> getProducts() {
		return products;
	}
	public void setProducts(List<Cart> products) {
		this.products = products;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
}
