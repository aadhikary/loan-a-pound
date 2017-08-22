package com.loan.a.pound.web;

import java.util.Date;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.a.pound.model.dao.ILoanApplication;
import com.loan.a.pound.model.dao.IUser;
import com.loan.a.pound.model.dao.impl.LoanApplication;
import com.loan.a.pound.model.dao.impl.User;
import com.loan.a.pound.model.dao.repositories.ILoanApplicationRepository;
import com.loan.a.pound.model.dao.repositories.IUserRepository;

@Controller
public class LoanAPoundIndex {
  
	@RequestMapping("/")
    public String index() {
        return "loan-a-pound";
    }

}
