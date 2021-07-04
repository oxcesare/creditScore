package com.crar.company.creditscore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crar.company.crediscore.model.CreditScore;
import com.crar.company.creditscore.service.impl.CreditServiceImpl;

@RestController
public class CreditScoreController {

	@Autowired
	CreditServiceImpl repo;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/creditscores/{snn}")
	public CreditScore getCreditScore(@PathVariable("snn") String snn) {		
		return repo.getCreditScore(snn);
	}	
}
