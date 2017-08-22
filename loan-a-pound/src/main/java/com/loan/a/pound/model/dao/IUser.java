package com.loan.a.pound.model.dao;

import org.springframework.stereotype.Component;

public interface IUser {
  
  public long getUserId();
  
  public void setName(String name);

  public String getName();

}
