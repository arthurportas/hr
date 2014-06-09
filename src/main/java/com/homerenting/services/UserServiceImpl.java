package com.homerenting.services;

import com.homerenting.domain.User;
import com.homerenting.repo.IUserDao;
import com.homerenting.repo.UserDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import java.util.List;

@Repository
public class UserServiceImpl implements IUserService {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UserServiceImpl.class);

    public static final String COMPONENT_NAME = "userServiceImpl";

    @Qualifier(UserDaoImpl.COMPONENT_NAME)
    @Autowired
    private IUserDao userDao;

    @Override
    public User getById(Long id) throws NoResultException {
        return userDao.findById(id);
    }

    @Override
    public User getByName(String name) throws NoResultException{
        return userDao.findByName(name);
    }

    @Override
    public List<User> getAllOrderedByName() throws NoResultException{
        return userDao.findAllOrderedByName();
    }

    @Override
    public List<User> getAllOrderedByNameDesc() throws NoResultException{
        return userDao.findAllOrderedByNameDesc();
    }

    @Override
    public void save(User user) {
        userDao.register(user);
    }

    @Deprecated
    @Override
    public boolean login(User user) throws NoResultException{
       if(userDao.findByEmail(user.getEmail()) != null){
           return true;
       }
       return false;
    }
}
