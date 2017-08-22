package com.loan.a.pound.model.dao.repositories;

import org.springframework.data.repository.CrudRepository;

import com.loan.a.pound.model.dao.impl.LoanApplication;

public interface IApplicationAndLoanType  extends CrudRepository<LoanApplication, Long>{
  

}
