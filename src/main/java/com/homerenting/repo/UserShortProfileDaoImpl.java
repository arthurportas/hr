package com.homerenting.repo;

import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.modules.header.security.Role;
import com.homerenting.domain.modules.header.security.Roles;
import org.apache.commons.exec.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;

@Repository(UserShortProfileDaoImpl.COMPONENT_NAME)
@Transactional
public class UserShortProfileDaoImpl extends GenericDaoImpl<UserShortProfile> implements IUserShortProfileDao, UserDetailsService {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UserShortProfileDaoImpl.class);

    public static final String COMPONENT_NAME = "userShortProfileDaoImpl";

	@Autowired
	private EntityManager em;

	public UserShortProfile findByEmail(String email) {
        slf4jLogger.info("==UserShortProfile findByEmail(String email)==");
		try{
            return (UserShortProfile) em.createNamedQuery(UserShortProfile.FIND_BY_EMAIL).setParameter("email", email).getSingleResult();
        }catch (NoResultException nre){
            slf4jLogger.info("==NoResultException==");
            slf4jLogger.info(nre.getMessage());
        }
        return null;
	}

    @Override
    public UserShortProfile findById(Long id) {
        slf4jLogger.info("==UserShortProfile findById(Long id)==");
        try{
            return em.find(UserShortProfile.class, id);
        }catch (NoResultException nre){
            slf4jLogger.info("==NoResultException==");
            slf4jLogger.info(nre.getMessage());
        }
        return null;
    }

    public List<UserShortProfile> findAllOrderedByEmail() {
        slf4jLogger.info("==List<UserShortProfile> findAllOrderedByEmail()==");
        try{
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<UserShortProfile> criteria = cb.createQuery(UserShortProfile.class);
            Root<UserShortProfile> user = criteria.from(UserShortProfile.class);
            criteria.select(user).orderBy(cb.asc(user.get("email")));
            return em.createQuery(criteria).getResultList();
        }catch (NoResultException nre){
            slf4jLogger.info("==NoResultException==");
            slf4jLogger.info(nre.getMessage());
        }
        return null;
	}

    @Override
    public List<UserShortProfile> findAllOrderedByEmailDesc() {
        slf4jLogger.info("==List<UserShortProfile> findAllOrderedByEmailDesc()==");
        try{
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<UserShortProfile> criteria = cb.createQuery(UserShortProfile.class);
            Root<UserShortProfile> user = criteria.from(UserShortProfile.class);
            criteria.select(user).orderBy(cb.desc(user.get("email")));
            return em.createQuery(criteria).getResultList();
        }catch (NoResultException nre){
            slf4jLogger.info("==NoResultException==");
            slf4jLogger.info(nre.getMessage());
        }
        return null;
    }

    @Override
    public void register(UserShortProfile user) {
        slf4jLogger.info("==void register(UserShortProfile user)==");
        em.persist(user);
    }

    @Override
    public boolean isAccountActivationTokenValid(UserShortProfile user, String token) {
        slf4jLogger.info("==boolean isAccountActivationTokenValid(String token)==");
        final String userToken = this.findByEmail(user.getEmail()).getToken().getToken();
        return userToken.equals(token) ? true : false;
    }

    @Override
    public List<Role> addRoles(List<Role> roles) {
        slf4jLogger.info("==boolean addRoles(List<Role> roles)==");
        Set<Role> userRoles =  new HashSet<Role>();
        List<Role> addedRoles = new ArrayList<Role>();
        for(Role r : roles) {
            Role role = new Role();
            role.setName(r.getName());
            if(userRoles.add(role)) {
                addedRoles.add(role);
            }
        }
        return addedRoles;
    }
    @Override
    public UserDetails _loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.loadUserByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserShortProfile details = this.findByEmail(username);//should validate password

        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        SimpleGrantedAuthority userAuthority = new SimpleGrantedAuthority(
                "ROLE_USER");
        SimpleGrantedAuthority adminAuthority = new SimpleGrantedAuthority(
                "ROLE_ADMIN");

        for (Iterator<Role> it = details.getRoles().iterator(); it.hasNext(); ) {
            Role role = it.next();
            if (role.getName().equals(Roles.ROLE_USER)){
                authorities.add(userAuthority);
            }else if(role.getName().equals(Roles.ROLE_ADMIN)){
                authorities.add(adminAuthority);
            }
        }
        UserDetails user = new User(details.getEmail(),
                details.getPassword(), true, true, true, true, authorities);
        return user;
    }
}
