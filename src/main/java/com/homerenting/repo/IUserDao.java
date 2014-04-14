package com.homerenting.repo;

import java.util.List;

import com.homerenting.domain.User;

public interface IUserDao  extends IGenericDao<User>{

	public User findByEmail(String email);

    public User findById(Long id);

    public User findByName(String name);

    public List<User> findAllOrderedByName();

    public List<User> findAllOrderedByNameDesc();

    public void register(User user);
}
