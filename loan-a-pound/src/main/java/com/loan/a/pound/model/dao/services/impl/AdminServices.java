package com.loan.a.pound.model.dao.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.loan.a.pound.core.logic.impl.LoanTypeName;
import com.loan.a.pound.model.dao.impl.LoanApplication;
import com.loan.a.pound.model.dao.repositories.IApplicationAndLoanType;
import com.loan.a.pound.model.dao.repositories.ILoanApplicationRepository;
import com.loan.a.pound.model.dao.repositories.IUserRepository;
import com.loan.a.pound.services.IAdminServices;

public class AdminServices implements IAdminServices {

  @Autowired
  public IUserRepository userRepository;

  @Autowired
  public ILoanApplicationRepository loanApplicationRepository;

  @Autowired
  public IApplicationAndLoanType applicationLoanType;


  @Override
  public List<LoanApplication> getAllLinkedLoanApplication(long userId) {
    // return loanApplicationRepository.find(userId);
    return null;
  }

  @Override
  public void setUpValidLoanType(long applicationId, LoanTypeName loanType) {
    // LoanApplication loanApplication = loanApplicationRepository.findOne(applicationId);
    // TODO


  }

}
