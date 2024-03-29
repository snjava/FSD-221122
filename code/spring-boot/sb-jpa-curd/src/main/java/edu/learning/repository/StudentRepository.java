package edu.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
