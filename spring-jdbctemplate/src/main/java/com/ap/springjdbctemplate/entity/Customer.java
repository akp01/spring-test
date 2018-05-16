package com.ap.springjdbctemplate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUST_SEQ")
	 @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="CUST_ID")
	private Long customerId;
	
	@Column(name="CUST_NAME", nullable = false, unique = true)
	private String name;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipCode;
	private String phone;
	private String email;
	private Integer spendingLimit;

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
