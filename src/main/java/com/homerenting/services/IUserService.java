package com.homerenting.services;

import com.homerenting.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    public User getById(Long id);

    public User getByName(String name);

    public List<User> getAllOrderedByName();

    public List<User> getAllOrderedByNameDesc();

    public void save(User user);

    public boolean login(User user);
}
