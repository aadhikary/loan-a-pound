package com.loan.a.pound.model.dao.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.loan.a.pound.model.dao.IUser;

@Entity
@Table(name="users")
public class User implements IUser {
  
  @Id
  @Column(name="user_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected long userId;
  
  @Column(name = "name")
  protected String name;
  
  public User() {
  }
  
  public long getUserId() {
    return userId;
  }
  
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
	

}
