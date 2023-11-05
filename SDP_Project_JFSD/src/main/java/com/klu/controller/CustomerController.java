package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.Customer;
import com.klu.model.CustomerManager;
@RestController
@RequestMapping("/sdp")
public class CustomerController {
	@Autowired
	CustomerManager rm;
	@PostMapping("/register")
	public String register(@RequestBody Customer r1) {
		return rm.registration(r1);
	}
}
