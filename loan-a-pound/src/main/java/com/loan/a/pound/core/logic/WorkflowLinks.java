package com.loan.a.pound.core.logic;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import com.loan.a.pound.model.dao.Status;

public class WorkflowLinks {
	
	public Status primaryStatusLink;
	
	public Set<Status> secondaryStatusLinkSet;
	
	public WorkflowLinks(Status primaryStatusLink, Status... secondaryStatusLinks) {
		this.primaryStatusLink = primaryStatusLink;
		this.secondaryStatusLinkSet = new TreeSet<>(Arrays.asList(secondaryStatusLinks));
	}

}
