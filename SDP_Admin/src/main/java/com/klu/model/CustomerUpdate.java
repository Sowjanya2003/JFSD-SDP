package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.entity.Customer;
import com.klu.repository.CustomerRepository;

@Service
public class CustomerUpdate {
	@Autowired
	CustomerRepository rr;
	public String updateMobile(Long id,String mob) {
		Customer customer = rr.findById(id).get();
        customer.setMob(mob);
        rr.save(customer);
        return "Customer Updated Successfully!!";
	}
}
