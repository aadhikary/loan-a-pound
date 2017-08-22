package com.loan.a.pound.model.dao;

public interface IUserCreditScores {
  
  public long getUserId();

  public void setUserId(long userId);

  public long getCreditorId();
  
  public void setCreditorId(long creditorId);

  public long getCreditScore();
  
  public void setCreditScore(long creditScore);

}
