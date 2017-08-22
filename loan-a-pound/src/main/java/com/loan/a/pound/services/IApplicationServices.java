package com.loan.a.pound.services;

import java.util.List;
import java.util.UUID;

import com.loan.a.pound.model.dao.IApplication;
import com.loan.a.pound.model.dao.Status;
import com.loan.a.pound.model.dao.repositories.IUserRepository;

public interface IApplicationServices {
	
	public UUID sendApplication(IApplication application);

	public IApplication getApplication(UUID applicationId);

	public List<IApplication> getRelatedApplications(IUserRepository user);

	public boolean updateApplication(IApplication application);
	
	public Status getApplicationProgress(UUID applicationId);

}
