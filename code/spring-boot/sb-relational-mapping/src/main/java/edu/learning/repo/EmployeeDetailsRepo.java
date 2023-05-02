package edu.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails, Integer> {

}
