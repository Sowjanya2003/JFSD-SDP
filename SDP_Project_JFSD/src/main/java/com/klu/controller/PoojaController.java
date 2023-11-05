package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.Pooja;
import com.klu.model.PoojaManager;

@RestController
@RequestMapping("/sdp1")
public class PoojaController {
	@Autowired
	PoojaManager rm;
	@PostMapping("/pooja")
	public String register(@RequestBody Pooja r1) {
		return rm.registration(r1);
	}
}