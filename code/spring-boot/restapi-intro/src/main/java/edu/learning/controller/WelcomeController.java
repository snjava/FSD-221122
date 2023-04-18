package edu.learning.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome-rest")
	public String firstRestApi() {
		System.out.println("This is my first REST API");
		return "Welcome to my first rest API";
	}
	
	// http://localhost:8080/say-hello?fname=Abc&lname=xyz
	/*@GetMapping("/say-hello")
	public String sayHello(HttpServletRequest request) {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String fullName = firstName + " " + lastName;
		return "<h1>Hello "+fullName+"...</h1>";
	}*/
	
	// http://localhost:8080/say-hello?fname=Abc&lname=xyz
	@GetMapping("/say-hello")
	public String sayHello(@RequestParam("fname") String firstName, @RequestParam("lname") String lastName) {
		String fullName = firstName + " " + lastName;
		return "<h1>Hello "+fullName+"...</h1>";
	}
}















