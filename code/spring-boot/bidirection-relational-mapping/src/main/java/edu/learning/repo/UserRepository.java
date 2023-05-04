package edu.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
