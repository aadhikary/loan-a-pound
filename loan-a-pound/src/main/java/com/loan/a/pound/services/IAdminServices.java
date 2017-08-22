package com.loan.a.pound.services;

import java.util.List;

import com.loan.a.pound.core.logic.impl.LoanTypeName;
import com.loan.a.pound.model.dao.impl.LoanApplication;

public interface IAdminServices {
  
  public List<LoanApplication> getAllLinkedLoanApplication(long userId);
  
  public void setUpValidLoanType(long applicationId, LoanTypeName loanType);

}
