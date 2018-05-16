package com.ap.springboot.service;

import java.util.List;

import com.ap.springboot.bean.CustomerInfo;

public interface CustomerServiceInterface {
	
	public List<CustomerInfo> getCustomers();

	public CustomerInfo getCustomer(Long customerId);

}
