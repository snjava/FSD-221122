package edu.learning.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Employee;
import edu.learning.repo.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepo;

	@PostMapping("/save-emp")
	public String saveEmp(@RequestBody Employee emp) {
		empRepo.save(emp);
		return "Empolyee Save Successfully....";
	}
	
	@GetMapping("/get-emp-byexperience-hql/{exeperience}")
	public List<Employee> getEmpByExperienceHql(@PathVariable("exeperience") double exeperience) {
		return empRepo.getEmpByExperienceHQL(exeperience);
	}
	
	@GetMapping("/get-emp-byexperience-sql/{exeperience}")
	public List<Employee> getEmpByExperienceSql(@PathVariable("exeperience") double exeperience) {
		return empRepo.getEmpByExperienceSQL(exeperience);
	}

	@GetMapping("/get-emp-by-city/{city}")
	public List<Employee> getEmpByCity(@PathVariable("city") String city) {
		return empRepo.getEmpByCity(city);
	}
	
	@GetMapping("/get-emp-by-salary")
	public List<Employee> getEmpBySalary(@RequestParam("salary") double salary) {
		return empRepo.getEmpBySalary(salary);
	}
	
	@PutMapping("/increment-emp-salary/{percent}")
	public String updateSalarybyPercent(@PathVariable("percent") double percent) {
		empRepo.updateSalarybyPercent(percent/100);
		return "Salary Updated successfully..";
	}
	
	@DeleteMapping("/delete-by-city")
	public String deleteEmpByCity(@RequestParam("ct") String city) {
		empRepo.deleteByCity(city);
		return "Deleted Successfully....";
	}
	
	
}


















