package com.loan.subham.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.loan.subham.entities.CreditRisk;
import com.loan.subham.entities.LoanApp;
import com.loan.subham.payloads.CreditRiskDTO;

public interface CreditRiskRepo extends JpaRepository<CreditRisk, String>{
	
	//List<CreditRisk> findByLoanAppId(String loanAppId);
    @Query("SELECT CASE WHEN COUNT(c)>0 THEN TRUE ELSE FALSE END FROM CreditRisk c WHERE c.crId=:crId")
	
	Boolean isCreditExistById(String crId);
}
