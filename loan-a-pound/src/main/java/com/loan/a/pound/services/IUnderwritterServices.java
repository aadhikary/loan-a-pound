package com.loan.a.pound.services;

import com.loan.a.pound.model.dao.impl.LoanApplication;

public interface IUnderwritterServices {
  
  public void approveLoan(LoanApplication loanApplication);

  public void denyLoan(LoanApplication loanApplication);

}
