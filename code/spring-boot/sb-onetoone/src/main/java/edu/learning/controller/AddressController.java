package edu.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Address;
import edu.learning.repsotory.AddressRepository;

@RestController
public class AddressController {

	@Autowired
	private AddressRepository repo;
	
	@PostMapping("/save-add")
	public String saveAddress(@RequestBody Address add) {
		repo.save(add);
		return "Address Added Successfully...";
	}
	
}
