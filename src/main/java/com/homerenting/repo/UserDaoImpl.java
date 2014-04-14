package com.homerenting.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.homerenting.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User> implements IUserDao {

	@Autowired
	private EntityManager em;

	public User findByEmail(String email) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		Root<User> user = criteria.from(User.class);
		criteria.select(user).where(builder.equal(user.get("email"), email));
		return em.createQuery(criteria).getSingleResult();
	}

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    public List<User> findAllOrderedByName() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> criteria = cb.createQuery(User.class);
		Root<User> user = criteria.from(User.class);
		criteria.select(user).orderBy(cb.asc(user.get("firstName")));
		return em.createQuery(criteria).getResultList();
	}

    @Override
    public List<User> findAllOrderedByNameDesc() {
        return null;
    }

    @Override
    public void register(User user) {

    }

}
