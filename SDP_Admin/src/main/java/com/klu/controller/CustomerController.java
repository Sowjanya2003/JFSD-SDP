package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.Customer;
import com.klu.model.CustomerManager;
import com.klu.model.CustomerDeleteData;
import com.klu.model.CustomerReadData;
import com.klu.model.CustomerUpdate;
@RestController
@RequestMapping("/sdp")
public class CustomerController {
	@Autowired
	CustomerManager rm;
	@Autowired
	CustomerUpdate ru;
	@Autowired
	CustomerDeleteData rd;
	@Autowired
	CustomerReadData rr;
	@PostMapping("/register")
	public String register(@RequestBody Customer r1) {
		return rm.registration(r1);
	}
	@PutMapping("/update/{id}/{mob}")
	public String updateStatus(@PathVariable("id") Long id, @PathVariable("mob") String mob) {
		return ru.updateMobile(id, mob);
	}
	@DeleteMapping("/delete/{id}")
	public String cancelRegistration(@PathVariable("id") Long id) {
		return rd.deleteData(id);
	}
	@GetMapping("/read")
	public String read() {
		return rr.readData().toString();
	}
}
