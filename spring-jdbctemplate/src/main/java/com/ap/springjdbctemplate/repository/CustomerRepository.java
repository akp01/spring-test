package com.ap.springjdbctemplate.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ap.springjdbctemplate.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	List<Customer> findByName(String name);

	//Optional<Customer> findCustomer(Long id);

}
