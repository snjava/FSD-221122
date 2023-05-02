package edu.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.EmployeeDetails;
import edu.learning.repo.EmployeeDetailsRepo;

@RestController
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailsRepo repo;
	
	@PostMapping("/save-emp-details")
	public String saveEmp(@RequestBody EmployeeDetails details) {
		repo.save(details);
		return "Employee Save Successfully....";
	}
	
}
