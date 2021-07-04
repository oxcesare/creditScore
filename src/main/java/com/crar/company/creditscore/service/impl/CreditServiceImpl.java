package com.crar.company.creditscore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crar.company.crediscore.model.CreditScore;
import com.crar.company.creditscore.repository.CreditScoreRepository;
import com.crar.company.creditscore.service.CreditService;

@Service
public class CreditServiceImpl implements CreditService {
	
	
	@Autowired
	CreditScoreRepository repo;

	@Override
	public CreditScore getCreditScore(String snn) {
		return repo.findById(snn).get();
	}
}
