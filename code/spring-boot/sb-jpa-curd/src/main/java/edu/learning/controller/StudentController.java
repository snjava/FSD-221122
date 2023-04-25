package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Student;
import edu.learning.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody Student stud) {
		repo.save(stud);	// insert or update the records
		return "Student Save Successfully...";
	}
	
	@GetMapping("/get-students")
	public List<Student> getAll() {
		return repo.findAll();	// select all the records
	}
	
	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student stud) {
		repo.save(stud);	// insert or update the records by PK
		return "Student Updated Successfully...";
	}
	
	@DeleteMapping("/delete-student-byid")
	public String deleteStudent(@RequestParam int id) {
		repo.deleteById(id); // delete the records by PK
		return "Student Deleted Successfully...";
	}
	
}















