package com.loan.a.pound.core.logic;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.loan.a.pound.core.logic.impl.LoanEngine;
import com.loan.a.pound.credit.checkers.ICreditChecker;
import com.loan.a.pound.model.dao.impl.User;

public class LoanEngineTest {
  
  @Test
  public void testApproveLoan_LoanCanBeApproved() {
    User user = new User();
    ICreditChecker creditChecker = Mockito.mock(ICreditChecker.class);
    Mockito.when(creditChecker.getCreditScore(user)).thenReturn(1022l);
    Assert.assertTrue(LoanEngine.approveLoan(creditChecker, user));
    Mockito.verify(creditChecker, Mockito.times(1)).getCreditScore(user);
  }

  @Test
  public void testApproveLoan_LoanShouldBeRejected() {
    User user = new User();
    ICreditChecker creditChecker = Mockito.mock(ICreditChecker.class);
    Mockito.when(creditChecker.getCreditScore(user)).thenReturn(22l);
    Assert.assertFalse(LoanEngine.approveLoan(creditChecker, user));
    Mockito.verify(creditChecker, Mockito.times(1)).getCreditScore(user);
  }

}
