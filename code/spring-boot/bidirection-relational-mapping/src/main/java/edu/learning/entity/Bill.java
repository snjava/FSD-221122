package edu.learning.entity;

import java.util.List;

public class Bill {
	private String name;
	private String email;
	private List<Cart> products;
	private double taxAmt;
	private double totalAmt;
	private double payableAmt;
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
	public List<Cart> getProducts() {
		return products;
	}
	public void setProducts(List<Cart> products) {
		this.products = products;
	}
	public double getTaxAmt() {
		return taxAmt;
	}
	public void setTaxAmt(double taxAmt) {
		this.taxAmt = taxAmt;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public double getPayableAmt() {
		return payableAmt;
	}
	public void setPayableAmt(double payableAmt) {
		this.payableAmt = payableAmt;
	}
}
