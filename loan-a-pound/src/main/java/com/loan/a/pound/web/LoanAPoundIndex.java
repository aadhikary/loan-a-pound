package com.loan.a.pound.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanAPoundIndex {
  
	@RequestMapping("/")
    public String index() {
        return "Greetings from LoanAPound!";
    }

}
