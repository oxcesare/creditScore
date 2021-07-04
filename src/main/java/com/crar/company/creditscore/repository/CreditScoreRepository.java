package com.crar.company.creditscore.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crar.company.crediscore.model.CreditScore;

@Repository
public interface CreditScoreRepository extends CrudRepository<CreditScore, String> {
 
}
