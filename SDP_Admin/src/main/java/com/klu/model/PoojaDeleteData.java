package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.repository.PoojaRepository;

@Service
public class PoojaDeleteData {
	@Autowired
	PoojaRepository rr;
	public String deleteData(Long id) {
		rr.deleteById(id);
        return "Service Deleted Successfully!!";
	}
}