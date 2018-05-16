package com.ap.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.springboot.bean.CustomerInfo;
import com.ap.springboot.entity.Customer;
import com.ap.springboot.repository.jpa.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<CustomerInfo> getCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customers = customerRepository.findAll();
		
		List<CustomerInfo> customerInfoDetails = new ArrayList<>();
		
		
		for(Customer cust:customers) {
			CustomerInfo info = new CustomerInfo();
			info.setCustomerId(cust.getCustomerId());
			info.setName(cust.getName());
			info.setAddress1(cust.getAddress1());
			info.setAddress2(cust.getAddress2());
			info.setCity(cust.getCity());
			info.setState(cust.getState());
			info.setEmail(cust.getEmail());
			info.setPhone(cust.getPhone());
			info.setZipCode(cust.getZipCode());
		
			
		}
		
		
		
		return customerInfoDetails;
	}

	@Override
	public CustomerInfo getCustomer(Long customerId) {
		
		Customer cust = customerRepository.findById(customerId).get();
		
		CustomerInfo info = new CustomerInfo();
		info.setCustomerId(cust.getCustomerId());
		info.setName(cust.getName());
		info.setAddress1(cust.getAddress1());
		info.setAddress2(cust.getAddress2());
		info.setCity(cust.getCity());
		info.setState(cust.getState());
		info.setEmail(cust.getEmail());
		info.setPhone(cust.getPhone());
		info.setZipCode(cust.getZipCode());
		return info;
	}

	@Override
	public CustomerInfo createCustomer(CustomerInfo customer) {
		
		Customer info = new Customer();
		info.setCustomerId(customer.getCustomerId());
		info.setName(customer.getName());
		info.setAddress1(customer.getAddress1());
		info.setAddress2(customer.getAddress2());
		info.setCity(customer.getCity());
		info.setState(customer.getState());
		info.setEmail(customer.getEmail());
		info.setPhone(customer.getPhone());
		info.setZipCode(customer.getZipCode());
		
		Customer cust = customerRepository.save(info);
		
		customer.setCustomerId(cust.getCustomerId());
		return customer;
		
	}

}
