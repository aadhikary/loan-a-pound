package com.loan.a.pound.credit.checkers;

import com.loan.a.pound.model.dao.impl.User;

public class CreditCheckerB implements ICreditChecker {

  @Override
  public long getCreditScore(User user) {
    return 111;
  }

}
