package com.homerenting.services;

import com.homerenting.domain.User;
import com.homerenting.repo.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserServiceImpl implements IUserService {

    public static final String COMPONENT_NAME = "userServiceImpl";


    @Autowired
    private IUserDao userDao;

    @Override
    public User getById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public User getByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public List<User> getAllOrderedByName() {
        return userDao.findAllOrderedByName();
    }

    @Override
    public List<User> getAllOrderedByNameDesc() {
        return userDao.findAllOrderedByNameDesc();
    }

    @Override
    public void save(User user) {
        userDao.register(user);
    }

    @Override
    public boolean login(User user) {
       if(userDao.findByEmail(user.getEmail()) != null){
           return true;
       }
       return false;
    }
}
