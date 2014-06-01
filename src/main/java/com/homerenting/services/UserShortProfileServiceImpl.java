package com.homerenting.services;

import com.homerenting.domain.UserShortProfile;
import com.homerenting.repo.IUserShortProfileDao;
import com.homerenting.repo.UserShortProfileDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(UserShortProfileServiceImpl.COMPONENT_NAME)
@Transactional
public class UserShortProfileServiceImpl implements IUserShortProfileService{

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UserShortProfileServiceImpl.class);

    public static final String COMPONENT_NAME = "userShortProfileServiceImpl";

    @Qualifier(UserShortProfileDaoImpl.COMPONENT_NAME)
    @Autowired
    private IUserShortProfileDao userShortProfileDao;

    @Override
    public UserShortProfile getById(Long id) {
        slf4jLogger.info("==UserShortProfile getById(Long id)==");
        return userShortProfileDao.findById(id);
    }

    @Override
    public UserShortProfile getByEmail(String email) {
        slf4jLogger.info("==Parish getByEmail(String email)==");
        return userShortProfileDao.findByEmail(email);
    }

    @Override
    public List<UserShortProfile> getAllOrderedByEmail() {
        slf4jLogger.info("==List<UserShortProfile> getAllOrderedByEmail()==");
        return userShortProfileDao.findAllOrderedByEmail();
    }

    @Override
    public List<UserShortProfile> getAllOrderedByEmailDesc() {
        slf4jLogger.info("==List<UserShortProfile> getAllOrderedByEmailDesc()==");
        return userShortProfileDao.findAllOrderedByEmailDesc();
    }

    @Override
    public void save(UserShortProfile user) {
        slf4jLogger.info("==void save(UserShortProfile user)==");
        userShortProfileDao.register(user);
    }

    @Override
    public void update(UserShortProfile user) {
        slf4jLogger.info("==void update(UserShortProfile user)==");
        userShortProfileDao.update(user);
    }

    @Override
    public boolean isAccountActivationTokenValid(UserShortProfile user, String token) {
        slf4jLogger.info("==boolean isAccountActivationTokenValid()==");
        return userShortProfileDao.isAccountActivationTokenValid(user, token);
    }

    @Override
    public void activateAccount(UserShortProfile user) {
        slf4jLogger.info("==void activateAccount(UserShortProfile user)==");
        user.setAccountEnabled(true);
        userShortProfileDao.update(user);
    }

    @Deprecated
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        slf4jLogger.info("==UserDetails loadUserByUsername(String username) throws UsernameNotFoundException==");
        return userShortProfileDao._loadUserByUsername(username);
    }
}
