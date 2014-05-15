package com.homerenting.repo;

import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.modules.header.security.Role;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface IUserShortProfileDao extends IGenericDao<UserShortProfile>{

	public UserShortProfile findByEmail(String email);

    public UserShortProfile findById(Long id);

    public List<UserShortProfile> findAllOrderedByEmail();

    public List<UserShortProfile> findAllOrderedByEmailDesc();

    public void register(UserShortProfile user);

    public boolean isAccountActivationTokenValid(UserShortProfile user, String token);

    public List<Role> addRoles(List<Role> roles);

    /*Spring security reserved*/
    @Deprecated
    public UserDetails _loadUserByUsername(String username) throws UsernameNotFoundException;

}
