package com.loan.a.pound.model.dao.repositories;

import org.springframework.data.repository.CrudRepository;

import com.loan.a.pound.model.dao.impl.LoanApplication;

public interface ILoanApplicationRepository extends CrudRepository<LoanApplication, Long> {
  

}
