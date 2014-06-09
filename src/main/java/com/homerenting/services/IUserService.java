package com.homerenting.services;

import com.homerenting.domain.User;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

public interface IUserService {

    public User getById(Long id) throws NoResultException;

    public User getByName(String name) throws NoResultException;

    public List<User> getAllOrderedByName() throws NoResultException;

    public List<User> getAllOrderedByNameDesc() throws NoResultException;

    public void save(User user);

    @Deprecated
    public boolean login(User user) throws NoResultException;
}
