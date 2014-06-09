package com.homerenting.repo;

import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.modules.header.security.Role;
import com.homerenting.domain.modules.header.security.Roles;
import org.hibernate.NonUniqueResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
@Transactional(noRollbackFor={NoResultException.class, NonUniqueResultException.class})
public class UserShortProfileDaoImpl extends GenericDaoImpl<UserShortProfile> implements IUserShortProfileDao, UserDetailsService {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UserShortProfileDaoImpl.class);

    public static final String COMPONENT_NAME = "userShortProfileDaoImpl";

	@Autowired
	private EntityManager em;

	public UserShortProfile findByEmail(String email) throws NoResultException{
        slf4jLogger.info("==UserShortProfile findByEmail(String email)==");
        return (UserShortProfile) em.createNamedQuery(UserShortProfile.FIND_BY_EMAIL)
                .setParameter("email", email)
                .getSingleResult();
	}

    @Override
    public UserShortProfile findById(Long id) throws NoResultException{
        slf4jLogger.info("==UserShortProfile findById(Long id)==");
            return em.find(UserShortProfile.class, id);
    }

    public List<UserShortProfile> findAllOrderedByEmail() throws NoResultException{
        slf4jLogger.info("==List<UserShortProfile> findAllOrderedByEmail()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserShortProfile> criteria = cb.createQuery(UserShortProfile.class);
        Root<UserShortProfile> user = criteria.from(UserShortProfile.class);
        criteria.select(user).orderBy(cb.asc(user.get("email")));
        return em.createQuery(criteria).getResultList();
	}

    @Override
    public List<UserShortProfile> findAllOrderedByEmailDesc() throws NoResultException{
        slf4jLogger.info("==List<UserShortProfile> findAllOrderedByEmailDesc()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserShortProfile> criteria = cb.createQuery(UserShortProfile.class);
        Root<UserShortProfile> user = criteria.from(UserShortProfile.class);
        criteria.select(user).orderBy(cb.desc(user.get("email")));
        return em.createQuery(criteria).getResultList();
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
            role.setRoleName(r.getRoleName());
            if(userRoles.add(role)) {
                addedRoles.add(role);
            }
        }
        return addedRoles;
    }
    @Deprecated
    @Override
    public UserDetails _loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.loadUserByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserShortProfile userEntity;

        try {
            userEntity = this.findByEmail(username);//should validate password

            if (userEntity == null) {
                throw new UsernameNotFoundException("user not found");
            }
        } catch (NoResultException nre) {
            slf4jLogger.info("==NoResultException==");
            slf4jLogger.info(nre.getMessage());
            throw new UsernameNotFoundException("database error");
        }

        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        SimpleGrantedAuthority userAuthority = new SimpleGrantedAuthority(
                "ROLE_USER");
        SimpleGrantedAuthority adminAuthority = new SimpleGrantedAuthority(
                "ROLE_ADMIN");

        for (Iterator<Role> it = userEntity.getRoles().iterator(); it.hasNext(); ) {
            Role role = it.next();
            if (role.getRoleName().equals(Roles.ROLE_USER)){
                authorities.add(userAuthority);
            }else if(role.getRoleName().equals(Roles.ROLE_ADMIN)){
                authorities.add(adminAuthority);
            }
        }
        String email = userEntity.getEmail();
        String password = userEntity.getPassword();
        //boolean enabled = details.isAccountEnabled();
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        UserDetails user = new User(email,
                                    password,
                                    enabled,
                                    accountNonExpired,
                                    credentialsNonExpired,
                                    accountNonLocked,
                                    authorities);
        return user;
    }
}
