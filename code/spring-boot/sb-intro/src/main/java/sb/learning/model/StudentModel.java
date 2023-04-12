package sb.learning.model;

import org.springframework.stereotype.Component;

@Component
public class StudentModel {
	public StudentModel() {
		System.out.println("StudentModel created....");
	}
	public void saveStudent() {
		System.out.println("Save Student");
	}

	public void updateStudent() {
		System.out.println("Update Student");
	}
}
