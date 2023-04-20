package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	// accepting user details using Parameter
	// http://localhost:8080/save-user?id=121&name=Abc&email=abc@gmail.com
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
	
	// accepting a data using path variable
	// http://localhost:8080/save-user1/123/Abc/abc@gmail.com
	@PostMapping("/save-user1/{id}/{name}/{email}")
	public String SaveUser1(@PathVariable(name = "id") int id, 
			@PathVariable(name = "name") String name, 
			@PathVariable(name = "email") String email) {
		User user = new User();
		user.setUserId(id);
		user.setUserName(name);
		user.setUserEmail(email);
		boolean result = service.addUser(user);
		return result ? "User added Successfully" : "Error in Creating User..";
	}
	
	
	/*
	 * // accepting a data using JSON
	 	{
	     	"userId": 222,
	     	"userName": "Pqr",
	     	"userEmail": "pqr@gmail.com"
		}
	 */
	@PostMapping("/save-user2")
	public String SaveUser1(@RequestBody User user) {
		boolean result = service.addUser(user);
		return result ? "User added Successfully" : "Error in Creating User..";
	}
	
	
}
























