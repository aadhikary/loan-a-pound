package com.loan.a.pound.model.dao.impl;

import org.joda.time.DateTime;

import com.loan.a.pound.model.dao.IUserApprovedLoans;

public class UserApprovedLoans implements IUserApprovedLoans {
  
  protected long userId;
  
  protected long loanApplicationId;
  
  protected double loanAmount;
  
  protected DateTime loanStartDate;

  protected DateTime loanEndDate;

  protected double interestRate;
  
  protected long approvedBy;

}
