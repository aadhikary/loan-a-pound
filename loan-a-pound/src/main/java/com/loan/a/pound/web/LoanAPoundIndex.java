package com.loan.a.pound.web;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.a.pound.model.dao.ILoanApplication;
import com.loan.a.pound.model.dao.IUser;
import com.loan.a.pound.model.dao.impl.LoanApplication;
import com.loan.a.pound.model.dao.impl.User;
import com.loan.a.pound.model.dao.repositories.ILoanApplicationRepository;
import com.loan.a.pound.model.dao.repositories.IUserRepository;

@RestController
public class LoanAPoundIndex {
  
  @Autowired
  public IUserRepository userDaoServices;

  @Autowired
  public ILoanApplicationRepository loanApplicationServices;
	
	@RequestMapping("/")
    public String index() {
	  User user = new User();
	  user.setName("Test");
	  
	  LoanApplication loanAPplication = new LoanApplication();
	  
	  loanAPplication.setLastUpdatedDate(new Date());
	  
	  userDaoServices.save(user);
	  loanApplicationServices.save(loanAPplication);
        return "Greetings from LoanAPound!";
    }

}
