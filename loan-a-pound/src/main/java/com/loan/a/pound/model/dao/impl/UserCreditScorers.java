package com.loan.a.pound.model.dao.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.loan.a.pound.model.dao.IUserCreditScores;

@Entity
@Table(name="user_credit_scorers")
public class UserCreditScorers implements IUserCreditScores  {
  
  @Id
  @Column(name="user_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected long userId;

  @Column(name="creditor_id", nullable = false)
  protected long creditorId;

  @Column(name="credit_score", nullable = false)
  protected long creditScore;
  
  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getCreditorId() {
    return creditorId;
  }

  public void setCreditorId(long creditorId) {
    this.creditorId = creditorId;
  }

  public long getCreditScore() {
    return creditScore;
  }

  public void setCreditScore(long creditScore) {
    this.creditScore = creditScore;
  }
  
}
