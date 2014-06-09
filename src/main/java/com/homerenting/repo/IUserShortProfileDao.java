package com.homerenting.repo;

import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.modules.header.security.Role;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.persistence.NoResultException;
import java.util.List;

public interface IUserShortProfileDao extends IGenericDao<UserShortProfile>{

	public UserShortProfile findByEmail(String email) throws NoResultException;

    public UserShortProfile findById(Long id) throws NoResultException;

    public List<UserShortProfile> findAllOrderedByEmail() throws NoResultException;

    public List<UserShortProfile> findAllOrderedByEmailDesc() throws NoResultException;

    public void register(UserShortProfile user);

    public boolean isAccountActivationTokenValid(UserShortProfile user, String token);

    public List<Role> addRoles(List<Role> roles);

    /*Spring security reserved*/
    @Deprecated
    public UserDetails _loadUserByUsername(String username) throws UsernameNotFoundException;

}
