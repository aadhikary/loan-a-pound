package com.loan.a.pound.model.dao.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.loan.a.pound.core.logic.impl.Status;
import com.loan.a.pound.model.dao.ILoanApplication;
import com.loan.a.pound.model.dao.IUser;
import com.loan.a.pound.model.dao.impl.LoanApplication;
import com.loan.a.pound.model.dao.impl.User;
import com.loan.a.pound.model.dao.repositories.ILoanApplicationRepository;
import com.loan.a.pound.model.dao.repositories.IUserRepository;
import com.loan.a.pound.services.IClientServices;

public class ClientServices implements IClientServices{

  @Autowired
  public IUserRepository userRepository;

  @Autowired
  public ILoanApplicationRepository loanApplicationRepository;
  
  
  @Override
  @Transactional
  public void registerUser(User user) {
    userRepository.save(user);
  }

  @Override
  @Transactional
  public void submitApplication(LoanApplication loanApplication) {
    loanApplicationRepository.save(loanApplication);
  }

  @Override
  public Status getLoanApplicationStatus(long loanApplicationId) {
    LoanApplication loanApplication = loanApplicationRepository.findOne(loanApplicationId);
    if (loanApplication != null) {
      return loanApplication.getStatus();
    }
    return null;
  }

}
