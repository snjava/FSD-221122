package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.dto.User;
import edu.learning.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/get-all-users")
	public List<User> getAllUsers() {
		return service.getUser();
	}
	
	@PostMapping("/save-user")
	public String saveUser(@RequestParam int id, @RequestParam String name, 
			@RequestParam String email) {
		User user = new User();
		user.setUserId(id);
		user.setUserName(name);
		user.setUserEmail(email);
		boolean result = service.addUser(user);
		return result ? "User added Successfully" : "Error in Creating User..";
	}
	
	
}











