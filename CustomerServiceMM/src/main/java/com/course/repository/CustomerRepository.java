package com.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.course.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	@Query("SELECT u FROM Customer u WHERE u.name = ?1")
	public List<Customer> getCustomerByName(String name);
	@Query("SELECT u FROM Customer u WHERE u.email = ?1")
	public List<Customer> getCustomerByEmail(String email);
}
