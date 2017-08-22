package com.loan.a.pound.credit.checkers;

import com.loan.a.pound.model.dao.impl.User;

public interface ICreditChecker {
  
  public long getCreditScore(User user);

}
