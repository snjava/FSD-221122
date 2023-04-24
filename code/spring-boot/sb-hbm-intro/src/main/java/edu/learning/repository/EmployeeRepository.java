package edu.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.learning.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
