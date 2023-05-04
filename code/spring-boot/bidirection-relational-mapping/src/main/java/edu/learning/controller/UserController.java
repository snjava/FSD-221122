package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Bill;
import edu.learning.entity.User;
import edu.learning.repo.UserRepository;
import edu.learning.service.UserCartService;

@RestController
public class UserController {

	@Autowired
	private UserRepository repo;
	@Autowired
	private UserCartService cartService;
	
	@PostMapping("/save-user")
	public String saveUser(@RequestBody List<User> users) {
		repo.saveAll(users);
		return "Users Save Successfully...";
	}

	
	@GetMapping("/get-user-by-id")
	public User getUserById(@RequestParam int id) {
		return repo.findById(id).get();
	}
	
	
	@GetMapping("/generate-bill")
	public Bill generateBillById(@RequestParam int id) {
		return cartService.generateBill(id);
	}
	
}










