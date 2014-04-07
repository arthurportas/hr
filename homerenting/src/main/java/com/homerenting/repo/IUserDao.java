package com.homerenting.repo;

import java.util.List;

import com.homerenting.domain.User;

public interface IUserDao  extends IGenericDao<User>{

	public User findByEmail(String email);

	public List<User> findAllOrderedByName();

}
