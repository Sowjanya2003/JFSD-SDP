package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.entity.Pooja;
import com.klu.repository.PoojaRepository;

@Service
public class PoojaUpdate {
	@Autowired
	PoojaRepository rr;
	public String updateMobile(Long id,String poojaname) {
		Pooja customer = rr.findById(id).get();
        customer.setPoojaname(poojaname);
        rr.save(customer);
        return "Service Updated Successfully!!";
	}
}
