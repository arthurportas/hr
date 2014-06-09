package com.homerenting.repo;

import java.util.List;

import com.homerenting.domain.User;

import javax.persistence.NoResultException;

public interface IUserDao  extends IGenericDao<User>{

	public User findByEmail(String email) throws NoResultException;

    public User findById(Long id) throws NoResultException;

    public User findByName(String name) throws NoResultException;

    public List<User> findAllOrderedByName() throws NoResultException;

    public List<User> findAllOrderedByNameDesc() throws NoResultException;

    public void register(User user);
}
