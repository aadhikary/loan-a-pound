package com.loan.a.pound.model.dao.repositories;


import org.springframework.data.repository.CrudRepository;

import com.loan.a.pound.model.dao.impl.User;

public interface IUserRepository extends CrudRepository<User, Long>{

}
