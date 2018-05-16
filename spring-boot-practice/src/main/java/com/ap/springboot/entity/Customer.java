package com.ap.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	// @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUST_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUST_ID")
	private Long customerId;

	@Column(name = "CUST_NAME", nullable = false, unique = true)
	private String name;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zipCode;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private Integer spendingLimit;
	
	public Customer() {
		super();
	}

	public Customer(String name, String address1, String address2, String city, String state, String zipCode,
			String phone, String email, Integer spendingLimit) {
		super();
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phone = phone;
		this.email = email;
		this.spendingLimit = spendingLimit;
	}


	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSpendingLimit() {
		return spendingLimit;
	}

	public void setSpendingLimit(Integer spendingLimit) {
		this.spendingLimit = spendingLimit;
	}

}
