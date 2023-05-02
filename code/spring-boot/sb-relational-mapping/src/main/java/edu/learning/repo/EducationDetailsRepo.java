package edu.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.EducationDetails;

@Repository
public interface EducationDetailsRepo extends JpaRepository<EducationDetails, Integer> {

}
