package edu.learning.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.learning.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//-------HQL query
	@Query(value = "SELECT e FROM Employee e WHERE experience> :ex")
	public List<Employee> getEmpByExperienceHQL(@Param("ex") double exp);
	
	//-------SQL query
	@Query(value = "select * from employee where exec> :exp", nativeQuery = true)
	public List<Employee> getEmpByExperienceSQL(@Param("exp") double exp);
	
	@Query(value = "SELECT emp FROM Employee emp WHERE emp.city = :ct")
	public List<Employee> getEmpByCity(@Param("ct") String city);
	
	@Query(value = "select * from employee where emp_sal > :sal ", nativeQuery = true)
	public List<Employee> getEmpBySalary(@Param("sal") double salary);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE employee SET emp_sal = emp_sal+(emp_sal* :per)", nativeQuery = true)
	public void updateSalarybyPercent(@Param("per") double percent);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Employee WHERE city= :abc")
	public void deleteByCity(@Param("abc") String city);
}




