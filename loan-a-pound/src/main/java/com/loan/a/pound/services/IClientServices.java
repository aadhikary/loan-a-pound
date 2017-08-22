package com.loan.a.pound.services;

import com.loan.a.pound.core.logic.impl.Status;
import com.loan.a.pound.model.dao.impl.LoanApplication;
import com.loan.a.pound.model.dao.impl.User;

public interface IClientServices {
	
	public void registerUser(User user);

	public void submitApplication(LoanApplication loanApplication);

	public Status getLoanApplicationStatus(long loanId);
	
}
