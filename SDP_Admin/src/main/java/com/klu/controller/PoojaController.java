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

import com.klu.entity.Pooja;
import com.klu.model.PoojaManager;
import com.klu.model.PoojaDeleteData;
import com.klu.model.PoojaReadData;
import com.klu.model.PoojaUpdate;
@RestController
@RequestMapping("/sdppro")
public class PoojaController {
	@Autowired
	PoojaManager rm;
	@Autowired
	PoojaUpdate ru;
	@Autowired
	PoojaDeleteData rd;
	@Autowired
	PoojaReadData rr;
	@PostMapping("/register")
	public String register(@RequestBody Pooja r1) {
		return rm.registration(r1);
	}
	@PutMapping("/update/{id}/{poojaname}")
	public String updateStatus(@PathVariable("id") Long id, @PathVariable("mob") String poojaname) {
		return ru.updateMobile(id, poojaname);
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
