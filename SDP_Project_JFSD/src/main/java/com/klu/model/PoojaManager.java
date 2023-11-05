package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.entity.Pooja;
import com.klu.repository.PoojaRepository;

@Service
public class PoojaManager {
	@Autowired
	PoojaRepository rr;
	public String registration(Pooja ru1) {
		rr.save(ru1);
		return "Service booked Successfully!!";
	}
}