package com.homerenting.repo;

import com.homerenting.domain.UserShortProfile;
import org.apache.commons.exec.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository(UserShortProfileDaoImpl.COMPONENT_NAME)
@Transactional
public class UserShortProfileDaoImpl extends GenericDaoImpl<UserShortProfile> implements IUserShortProfileDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UserShortProfileDaoImpl.class);

    public static final String COMPONENT_NAME = "userShortProfileDaoImpl";

	@Autowired
	private EntityManager em;

	public UserShortProfile findByEmail(String email) {
        slf4jLogger.info("==UserShortProfile findByEmail(String email)==");
		try{
            return (UserShortProfile) em.createNamedQuery(UserShortProfile.FIND_BY_EMAIL).setParameter("email", email).getSingleResult();
        }catch (NoResultException nre){

        }
        return null;
	}

    @Override
    public UserShortProfile findById(Long id) {
        slf4jLogger.info("==UserShortProfile findById(Long id)==");
        return em.find(UserShortProfile.class, id);
    }

    public List<UserShortProfile> findAllOrderedByEmail() {
        slf4jLogger.info("==List<UserShortProfile> findAllOrderedByEmail()==");
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<UserShortProfile> criteria = cb.createQuery(UserShortProfile.class);
		Root<UserShortProfile> user = criteria.from(UserShortProfile.class);
		criteria.select(user).orderBy(cb.asc(user.get("email")));
		return em.createQuery(criteria).getResultList();
	}

    @Override
    public List<UserShortProfile> findAllOrderedByEmailDesc() {
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
}
