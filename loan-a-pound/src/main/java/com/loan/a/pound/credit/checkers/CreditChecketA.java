package com.loan.a.pound.credit.checkers;

import com.loan.a.pound.model.dao.impl.User;

public class CreditChecketA implements ICreditChecker {

  @Override
  public long getCreditScore(User user) {
    return 333;
  }

}
