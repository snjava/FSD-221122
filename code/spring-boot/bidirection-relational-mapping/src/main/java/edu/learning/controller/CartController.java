package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Cart;
import edu.learning.repo.CartRepository;

@RestController
public class CartController {

	@Autowired
	private CartRepository repo;
	
	@PostMapping("/add-to-cart")
	public String saveCart(@RequestBody List<Cart> products) {
		repo.saveAll(products);
		return "Products Save Successfully...";
	}
	
	@GetMapping("/get-by-id/{id}")
	public Cart getProductById(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
}










