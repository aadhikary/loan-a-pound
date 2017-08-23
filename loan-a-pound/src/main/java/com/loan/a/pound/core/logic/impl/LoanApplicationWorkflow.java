package com.loan.a.pound.core.logic.impl;

import java.util.List;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class LoanApplicationWorkflow {
  
  private static final MultiValueMap<Status, Status> WORKFLOW_LINK_SEQUENCE = getWorkflowLinkSequence();
  
  private static MultiValueMap<Status, Status> getWorkflowLinkSequence() {
    
    MultiValueMap<Status, Status> workflowLinkSequence = new LinkedMultiValueMap<>();
    workflowLinkSequence.add(Status.PENDING_REVIEW, Status.BEING_REVIEWED);
    workflowLinkSequence.add(Status.BEING_REVIEWED, Status.REVIEWED);
    workflowLinkSequence.add(Status.REVIEWED, Status.APPROVED);
    workflowLinkSequence.add(Status.REVIEWED, Status.DENIED);
    
    return workflowLinkSequence;
  }      
  
  public static List<Status> getNextApplicationStatus(Status currentApplicationStatus) {
    return WORKFLOW_LINK_SEQUENCE.get(currentApplicationStatus);
  }
  
}
