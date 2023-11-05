package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.entity.Customer;
import com.klu.repository.CustomerRepository;

@Service
public class CustomerManager {
	@Autowired
	CustomerRepository rr;
	public String registration(Customer ru1) {
		rr.save(ru1);
		return "Registered Successfully!!";
	}
}