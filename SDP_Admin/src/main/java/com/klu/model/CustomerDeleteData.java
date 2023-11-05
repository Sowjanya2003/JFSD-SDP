package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.repository.CustomerRepository;

@Service
public class CustomerDeleteData {
	@Autowired
	CustomerRepository rr;
	public String deleteData(Long id) {
		rr.deleteById(id);
        return "Customer Deleted Successfully!!";
	}
}