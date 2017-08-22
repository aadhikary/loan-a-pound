package com.loan.a.pound.core.logic;

import org.junit.Assert;
import org.junit.Test;

import com.loan.a.pound.core.logic.impl.LoanApplicationWorkflow;
import com.loan.a.pound.core.logic.impl.Status;

public class LoanApplicationWorkflowTest {
  
  @Test
  public void testWorkflowLinks() {
    Assert.assertTrue(LoanApplicationWorkflow.getNextApplicationStatus(Status.PENDING_REVIEW).contains(Status.BEING_REVIEWED));
    Assert.assertTrue(LoanApplicationWorkflow.getNextApplicationStatus(Status.BEING_REVIEWED).contains(Status.REVIEWED));
    Assert.assertTrue(LoanApplicationWorkflow.getNextApplicationStatus(Status.REVIEWED).contains(Status.APPROVED));
    Assert.assertTrue(LoanApplicationWorkflow.getNextApplicationStatus(Status.REVIEWED).contains(Status.DENIED));
  }
  

}
