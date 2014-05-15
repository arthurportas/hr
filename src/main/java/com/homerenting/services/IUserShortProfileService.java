package com.homerenting.services;

import com.homerenting.domain.UserShortProfile;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserShortProfileService {

    public UserShortProfile getById(Long id);

    public UserShortProfile getByEmail(String email);

    public List<UserShortProfile> getAllOrderedByEmail();

    public List<UserShortProfile> getAllOrderedByEmailDesc();

    public void save(UserShortProfile user);

    public void update(UserShortProfile user);

    public boolean isAccountActivationTokenValid(UserShortProfile user, String token);

    public void activateAccount(UserShortProfile user);

    @Deprecated
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
