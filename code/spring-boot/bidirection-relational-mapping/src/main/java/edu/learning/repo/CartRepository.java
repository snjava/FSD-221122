package edu.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
