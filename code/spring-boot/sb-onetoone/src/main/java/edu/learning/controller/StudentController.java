package edu.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Student;
import edu.learning.repsotory.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody Student student) {
		repo.save(student);
		return "Student Save Successfully...";
	}
	
}
