package edu.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.learning.entity.Bill;
import edu.learning.entity.Cart;
import edu.learning.entity.User;
import edu.learning.repo.UserRepository;

@Service
public class UserCartService {

	@Autowired
	private UserRepository repo;
	
	public Bill generateBill(int id) {
		User user = repo.findById(id).get();
		
		Bill bill = new Bill();
		bill.setName(user.getName());
		bill.setEmail(user.getEmail());
		bill.setProducts(user.getProducts());
		
		double totalPrice = 0;
		List<Cart> list = user.getProducts();
		
		for(Cart p : list) {
			totalPrice += p.getPrice() * p.getPqty();
		}
		
		bill.setTotalAmt(totalPrice);
		
		double tax = totalPrice * 0.06;
		bill.setTaxAmt(tax);
		
		bill.setPayableAmt(totalPrice + tax);
		
		return bill;
		
	}
	
	
}
