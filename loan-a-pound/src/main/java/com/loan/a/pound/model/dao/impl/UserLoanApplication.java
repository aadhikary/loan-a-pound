package com.loan.a.pound.model.dao.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.loan.a.pound.model.dao.IUserLoanApplication;

@Entity
@Table(name="user_loan_application")
public class UserLoanApplication implements IUserLoanApplication {
  
  @Id
  @Column(nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected long id;
  
  protected long userId;

  protected long loanApplicationId;


  public long getUserId() {
    return userId;
  }


  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getLoanApplicationId() {
    return loanApplicationId;
  }


  public void setLoanApplicationId(long loanApplicationId) {
    this.loanApplicationId = loanApplicationId;
  }
  
}
