package com.homerenting.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.homerenting.domain.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(UserDaoImpl.COMPONENT_NAME)
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User> implements IUserDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UserDaoImpl.class);

    public static final String COMPONENT_NAME = "userDaoImpl";

	@Autowired
	private EntityManager em;

	public User findByEmail(String email) {
        slf4jLogger.info("==User findByEmail(String email)==");
		return (User) em.createNamedQuery(User.FIND_BY_EMAIL).setParameter("email", email).getSingleResult();
	}

    @Override
    public User findById(Long id) {
        slf4jLogger.info("==User findById(Long id)==");
        return null;
    }

    @Override
    public User findByName(String name) {
        slf4jLogger.info("==User findByName(String name)==");
        return null;
    }

    public List<User> findAllOrderedByName() {
        slf4jLogger.info("==List<User> findAllOrderedByName()==");
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> criteria = cb.createQuery(User.class);
		Root<User> user = criteria.from(User.class);
		criteria.select(user).orderBy(cb.asc(user.get("firstName")));
		return em.createQuery(criteria).getResultList();
	}

    @Override
    public List<User> findAllOrderedByNameDesc() {
        slf4jLogger.info("==List<User> findAllOrderedByNameDesc()==");
        return null;
    }

    @Override
    public void register(User user) {
        slf4jLogger.info("==void register(User user)==");

    }

}
