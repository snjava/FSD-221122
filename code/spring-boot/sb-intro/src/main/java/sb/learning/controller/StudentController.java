package sb.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import sb.learning.model.StudentModel;

@Controller
public class StudentController {
	
	@Autowired
	StudentModel model;
	
	public StudentController() {
		System.out.println("StudentController Created...");
	}
}
