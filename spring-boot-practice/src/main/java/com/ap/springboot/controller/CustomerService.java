package com.ap.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ap.springboot.bean.Customer;

@RestController("/")
public class CustomerService {

	@GetMapping(value = "customers")
	public List<Customer> getCustomers() {
		return getCustomersMock();
	}
	
	@GetMapping(value = "customers/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") String customerId) {
		return getCustomerMock();
	}
	
	private List<Customer> getCustomersMock(){
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Ashok", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new Customer("Ashok1", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new Customer("Ashok2", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new Customer("Ashok3", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new Customer("Ashok4", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new Customer("Ashok5", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		return customers;
	}
	
	private Customer getCustomerMock(){
		
		return new Customer("Ashok", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000);

	}


}
