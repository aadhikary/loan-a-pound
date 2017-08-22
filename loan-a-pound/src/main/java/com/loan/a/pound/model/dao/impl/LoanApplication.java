package com.loan.a.pound.model.dao.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.loan.a.pound.core.logic.impl.Status;


/**
 * @author Silvia
 *
 */
/**
 * @author Silvia
 *
 */
@Entity
@Table(name="loan_application")
public class LoanApplication {

  @Id
  @Column(nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long loanApplicationId;

  @Column(nullable = false)
  private long userId;

  @Column(columnDefinition="DATETIME")
  @Temporal(TemporalType.TIMESTAMP)
  private Date loanCreationDate;

  @Column(columnDefinition="DATETIME")
  @Temporal(TemporalType.TIMESTAMP)
  private Date lastUpdatedDate;
  
  private long assignedAdministrator;

  private long assignedUnderwriter;

  @Column(nullable = false)
  private Status status;

  public Date getLoanCreationDate() {
    return loanCreationDate;
  }

  public void setLoanCreationDate(Date loanCreationDate) {
    this.loanCreationDate = loanCreationDate;
  }

  public Date getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(Date lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public long getLoanApplicationId() {
    return loanApplicationId;
  }

  public long getAssignedAdministrator() {
    return assignedAdministrator;
  }

  public void setAssignedAdministrator(long assignedAdministrator) {
    this.assignedAdministrator = assignedAdministrator;
  }

  public long getAssignedUnderwriter() {
    return assignedUnderwriter;
  }

  public void setAssignedUnderwriter(long assignedUnderwriter) {
    this.assignedUnderwriter = assignedUnderwriter;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
  
}
