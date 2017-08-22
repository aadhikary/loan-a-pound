package com.loan.a.pound.core.logic.impl;

import com.loan.a.pound.credit.checkers.ICreditChecker;
import com.loan.a.pound.model.dao.impl.LoanApplication;
import com.loan.a.pound.model.dao.impl.User;
import com.loan.a.pound.model.dao.repositories.ILoanApplicationRepository;
import com.loan.a.pound.services.IClientServices;

public class LoanEngine {
  
  public static boolean loanApproved(ICreditChecker creditChecker, LoanApplication loanApplication, User user) {
    
    if (creditChecker.getCreditScore(user) > 150) {
      return true;
    } 
    
    return false;
  }

}
