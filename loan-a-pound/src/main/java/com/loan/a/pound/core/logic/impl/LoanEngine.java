package com.loan.a.pound.core.logic.impl;

import com.loan.a.pound.credit.checkers.ICreditChecker;
import com.loan.a.pound.model.dao.impl.User;

public class LoanEngine {
  
  private static final long MINIMUM_REQUIRED_CREDIT_SCORE = 150;
  
  public static boolean approveLoan(ICreditChecker creditChecker, User user) {
    
    if (creditChecker.getCreditScore(user) > MINIMUM_REQUIRED_CREDIT_SCORE) {
      return true;
    } 
    
    return false;
  }

}
