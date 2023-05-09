package com.loan.subham.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.loan.subham.entities.LoanApp;

public interface LoanAppRepo extends JpaRepository<LoanApp, String>{
		List<LoanApp> findByLoanAppDate(Date date);
		
		@Query("SELECT CASE WHEN COUNT(l)>0 THEN TRUE ELSE FALSE END FROM LoanApp l WHERE l.loanAppId=:loanAppId")
		
		Boolean isLoanExistById(String loanAppId);
}
