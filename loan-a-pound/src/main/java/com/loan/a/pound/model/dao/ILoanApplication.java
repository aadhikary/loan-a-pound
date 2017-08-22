package com.loan.a.pound.model.dao;

import org.joda.time.DateTime;

public interface ILoanApplication {
  
  public long getLoanApplicationId();
  
  public DateTime getLoanCreationDate();

  public void setLoanCreationDate(DateTime loanCreationDate);

  public DateTime getLastUpdatedDate();
  
  public void setLastUpdatedDate(DateTime lastUpdatedDate);

}
