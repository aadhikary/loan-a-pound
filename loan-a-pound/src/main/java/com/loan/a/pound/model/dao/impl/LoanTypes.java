package com.loan.a.pound.model.dao.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.loan.a.pound.core.logic.impl.LoanTypeName;

@Entity
public class LoanTypes {
  
  @Id
  @Column(nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  private LoanTypeName loanTypeName;

  private double interestRate;

  private double fromAmount;

  private double toAmount;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LoanTypeName getLoanTypeName() {
    return loanTypeName;
  }

  public void setLoanTypeName(LoanTypeName loanTypeName) {
    this.loanTypeName = loanTypeName;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  public double getFromAmount() {
    return fromAmount;
  }

  public void setFromAmount(double fromAmount) {
    this.fromAmount = fromAmount;
  }

  public double getToAmount() {
    return toAmount;
  }

  public void setToAmount(double toAmount) {
    this.toAmount = toAmount;
  }

}
