package com.loan.a.pound.model.dao.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.loan.a.pound.model.dao.IUser;
import com.loan.a.pound.model.dao.impl.User;

public interface IUserRepository extends CrudRepository<User, Long>{

}
