package com.ap.springboot.init;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ap.springboot.entity.Customer;
import com.ap.springboot.repository.jpa.CustomerRepository;

@Component
public class ApplicationInitializer implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationInitializer.class);

	// @Autowired
	// ProductRepository productRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {

		// productRepository.save(getMockProductsJP());

		List<Customer> products = (List<Customer>) customerRepository.findAll();

		/*
		 * if (!StringUtils.isEmpty(products) && !products.isEmpty()) {
		 * productRepository.deleteAll(); }
		 */

		// productRepository.save(getMockProductsMD());
		products.stream().forEach(product -> customerRepository.delete(product));
		getMockProductsJP().stream().forEach(product -> customerRepository.save(product));

		customerRepository.findAll().stream().forEach(product -> {
			System.out.println(product.getCustomerId());
			System.out.println(product.getName());
			System.out.println(product.getAddress1());
			System.out.println(product.getAddress2());
		});
		logger.info(
				"Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.",
				Arrays.toString(args));
	}

	private List<Customer> getMockProductsJP() {

		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Ashok", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 4000));
		customers.add(new Customer("Rajeev", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 3000));
		customers.add(new Customer("Sameer", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 7000));
		customers.add(new Customer("Amit", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 9000));
		customers.add(new Customer("Kunal", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 2000));
		customers.add(new Customer("Paresh", "address1", "address2", "Iselin", "NJ", "08810", "2312312312", "abc@xyz.com", 11000));
		return customers;
	}

	

	
}
