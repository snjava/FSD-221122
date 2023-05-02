package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.EducationDetails;
import edu.learning.repo.EducationDetailsRepo;

@RestController
public class EducationDetailsController {

	@Autowired
	private EducationDetailsRepo repo;
	
	@PostMapping("/save-emp-edu")
	public String saveEmpEducation(@RequestBody EducationDetails details) {
		repo.save(details);
		return "Employee Education Details save successfully...";
	}
	
	
	@PostMapping("/save-emp-edu-details")
	public String saveEmpEducation(@RequestBody List<EducationDetails > details) {
		repo.saveAll(details);
		return "Employee Education Details save successfully...";
	}
	
}
