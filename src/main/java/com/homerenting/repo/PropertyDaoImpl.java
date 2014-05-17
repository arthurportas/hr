package com.homerenting.repo;

import com.homerenting.domain.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository(PropertyDaoImpl.COMPONENT_NAME)
@Transactional
public class PropertyDaoImpl implements IPropertyDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(PropertyDaoImpl.class);

    public static final String COMPONENT_NAME = "propertyDaoImpl";

    @Autowired
    private EntityManager em;

    public Property findById(Long id) {
        slf4jLogger.info("==Property findById(Long id)==");
        return em.find(Property.class, id);
    }

    public Property findByName(String name) {
        slf4jLogger.info("==Property findByName(String name)==");
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = builder.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).where(builder.equal(property.get("propertyName"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Property> findAllOrderedByName() {
        slf4jLogger.info("==List<Property> findAllOrderedByName()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = cb.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).orderBy(cb.asc(property.get("propertyName")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Property> findAllOrderedByNameDesc() {
        slf4jLogger.info("==List<Property> findAllOrderedByNameDesc()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = cb.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).orderBy(cb.desc(property.get("propertyName")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Property> findAllByNamePattern(String name) {
        slf4jLogger.info("==List<Property> findAllByNamePattern(String name)==");
        return em.createNamedQuery(Property.FIND_BY_NAME_PATTERN)
                .setParameter("propertyName",  "%" + name + "%").getResultList();
    }

    public void register(Property property) {
        slf4jLogger.info("==void register(Property property)==");
        em.persist(property);
        return;
    }

    @Override
    public List<Property> findAllHighLighted() {
        slf4jLogger.info("==List<Property> findAllHighLighted()==");//TODO: maxresults in config
        return em.createNamedQuery(Property.FIND_ALL_HIGHLIGHTED).setMaxResults(37).getResultList();
    }
}
