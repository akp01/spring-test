package com.ap.springboot.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.springboot.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	List<Customer> findByName(String name);

	//Optional<Customer> findCustomer(Long id);

}
