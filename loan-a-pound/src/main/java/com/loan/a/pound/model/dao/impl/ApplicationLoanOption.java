package com.loan.a.pound.model.dao.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.loan.a.pound.core.logic.impl.LoanTypeName;

@Entity
public class ApplicationLoanOption {

  @Id
  @Column(nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  @Column(nullable = false)
  private long applicationId;
  
  @Column(nullable = false)
  private LoanTypeName loanTypeName;

  public long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(long applicationId) {
    this.applicationId = applicationId;
  }

  public LoanTypeName getLoanTypeName() {
    return loanTypeName;
  }

  public void setLoanTypeName(LoanTypeName loanTypeName) {
    this.loanTypeName = loanTypeName;
  }
  
}
