package com.ap.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.springboot.bean.CustomerInfo;
import com.ap.springboot.service.CustomerServiceImpl;

@RestController("/")
public class CustomerService {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	
	@PostMapping(value = "customers", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerInfo createCustomer(@RequestBody CustomerInfo customer) {
		//TODO: process POST request
		
		return customerServiceImpl.createCustomer(customer);
	}


	@GetMapping(value = "customers")
	public List<CustomerInfo> getCustomers() {
		
		return customerServiceImpl.getCustomers();
		//return getCustomersMock();
	}
	
	@GetMapping(value = "customers/{customerId}")
	public CustomerInfo getCustomer(@PathVariable("customerId") Long customerId) {
		
		//return customerServiceImpl.getCustomer(customerId);
		return getCustomerMock();
	}
	
	
	
	
	
	
	// Stub data
	private List<CustomerInfo> getCustomersMock(){
		List<CustomerInfo> customers = new ArrayList<>();
		customers.add(new CustomerInfo("Ashok", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new CustomerInfo("Ashok1", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new CustomerInfo("Ashok2", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new CustomerInfo("Ashok3", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new CustomerInfo("Ashok4", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		customers.add(new CustomerInfo("Ashok5", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000));
		return customers;
	}
	
	private CustomerInfo getCustomerMock(){
		
		return new CustomerInfo("Ashok", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 5000);

	}


}
