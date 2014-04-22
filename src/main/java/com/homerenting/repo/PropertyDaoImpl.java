package com.homerenting.repo;

import com.homerenting.domain.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class PropertyDaoImpl implements IPropertyDao {

    public static final String COMPONENT_NAME = "propertyDaoImpl";
    @Autowired
    private EntityManager em;

    public Property findById(Long id) {
        return em.find(Property.class, id);
    }

    public Property findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = builder.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).where(builder.equal(property.get("propertyName"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Property> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = cb.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).orderBy(cb.asc(property.get("propertyName")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Property> findAllOrderedByNameDesc() {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = cb.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).orderBy(cb.desc(property.get("propertyName")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Property> findAllByNamePattern(String name) {
        return em.createNamedQuery(Property.FIND_BY_NAME_PATTERN)
                .setParameter("propertyName",  "%" + name + "%").getResultList();
    }

    public void register(Property property) {
        em.persist(property);
        return;
    }
}
