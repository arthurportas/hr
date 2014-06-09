package com.homerenting.repo;

import com.homerenting.domain.Parish;
import com.homerenting.mvc.NewsController;
import org.hibernate.NonUniqueResultException;
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

@Repository(ParishDaoImpl.COMPONENT_NAME)
@Transactional(noRollbackFor={NoResultException.class, NonUniqueResultException.class})
public class ParishDaoImpl implements IParishDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ParishDaoImpl.class);

    public static final String COMPONENT_NAME = "parishDaoImpl";

    @Autowired
    private EntityManager em;

    public Parish findById(Long id) throws NoResultException {
        slf4jLogger.info("==Parish findById(Long id)==");
        return em.find(Parish.class, id);
    }

    public Parish findByName(String name) throws NoResultException{
        slf4jLogger.info("==Parish findByName(String name)==");
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Parish> criteria = builder.createQuery(Parish.class);
        Root<Parish> parish = criteria.from(Parish.class);

        criteria.select(parish).where(builder.equal(parish.get("name"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Parish> findAllOrderedByName() throws NoResultException{
        slf4jLogger.info("==List<Parish> findAllOrderedByName()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Parish> criteria = cb.createQuery(Parish.class);
        Root<Parish> parish = criteria.from(Parish.class);

        criteria.select(parish).orderBy(cb.asc(parish.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    public void register(Parish parish) {
        slf4jLogger.info("==void register(Parish parish)==");
        em.persist(parish);
        return;
    }
}
