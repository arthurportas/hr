package com.homerenting.services;

import com.homerenting.domain.UserShortProfile;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

public interface IUserShortProfileService {

    public UserShortProfile getById(Long id) throws NoResultException;

    public UserShortProfile getByEmail(String email) throws NoResultException;

    public List<UserShortProfile> getAllOrderedByEmail() throws NoResultException;

    public List<UserShortProfile> getAllOrderedByEmailDesc() throws NoResultException;

    public void save(UserShortProfile user);

    public void update(UserShortProfile user);

    public boolean isAccountActivationTokenValid(UserShortProfile user, String token);

    public void activateAccount(UserShortProfile user);

    @Deprecated
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
