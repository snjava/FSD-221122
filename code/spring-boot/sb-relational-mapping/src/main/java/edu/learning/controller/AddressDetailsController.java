package edu.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.AddressDetails;
import edu.learning.repo.AddressDetailsRepo;

@RestController
public class AddressDetailsController {
	
	@Autowired
	private AddressDetailsRepo repo;
	
	@PostMapping("/save-emp-address")
	public String saveEmpAddress(@RequestBody AddressDetails details) {
		repo.save(details);
		return "Employee Address Save Successfully....";
	}
	
}
