package com.homerenting.repo;

import com.homerenting.domain.Property;
import com.homerenting.domain.modules.header.search.PropertyKind;
import org.hibernate.NonUniqueResultException;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.awt.print.Book;
import java.util.List;

@Repository(PropertyDaoImpl.COMPONENT_NAME)
@Transactional(noRollbackFor={NoResultException.class, NonUniqueResultException.class})
public class PropertyDaoImpl implements IPropertyDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(PropertyDaoImpl.class);

    public static final String COMPONENT_NAME = "propertyDaoImpl";

    //@Value("${highlights.max.results}")
    private int MAX_RESULTS = 37;

    @Autowired
    private EntityManager em;

    public Property findById(Long id) throws NoResultException {
        slf4jLogger.info("==Property findById(Long id)==");
        return em.find(Property.class, id);
    }

    public Property findByName(String name) throws NoResultException{
        slf4jLogger.info("==Property findByName(String name)==");
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = builder.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).where(builder.equal(property.get("propertyName"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Property> findAllOrderedByName() throws NoResultException{
        slf4jLogger.info("==List<Property> findAllOrderedByName()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = cb.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).orderBy(cb.asc(property.get("propertyName")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Property> findAllOrderedByNameDesc() throws NoResultException{
        slf4jLogger.info("==List<Property> findAllOrderedByNameDesc()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Property> criteria = cb.createQuery(Property.class);
        Root<Property> property = criteria.from(Property.class);

        criteria.select(property).orderBy(cb.desc(property.get("propertyName")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Property> findAllByNamePattern(String name) throws NoResultException{
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
        slf4jLogger.info("==List<Property> findAllHighLighted()==");
        return em.createNamedQuery(Property.FIND_ALL_HIGHLIGHTED)
                .setMaxResults(MAX_RESULTS)
                .getResultList();
    }

    @Override
    public List<Property> findAllByDistrict(final Long districtId) {
        slf4jLogger.info("==List<Property> findAllByDistrict(final Long districtId)==");
        return em.createNamedQuery(Property.FIND_ALL_BY_DISTRICT).setParameter("districtId", districtId).getResultList();
    }

    @Override
    public List<Property> findAllByRegion(Long regionId) {
        slf4jLogger.info("==List<Property> findAllByDistrict(final Long regionId)==");
        return em.createNamedQuery(Property.FIND_ALL_BY_REGION).setParameter("regionId", regionId).getResultList();
    }

    @Override
    public List<Property> findAllByDistrictAndRegion(Long districtId, Long regionId) {
        slf4jLogger.info("==List<Property> findAllByDistrictAndRegion(Long districtId, Long regionId)==");
        return em.createNamedQuery(Property.FIND_ALL_BY_DISTRICT_AND_REGION)
                .setParameter("districtId", districtId)
                .setParameter("regionId", regionId)
                .getResultList();
    }

    @Override
    public List<Property> findAllByPropertyKind(String propertyKind) {
        slf4jLogger.info("==List<Property> findAllByPropertyKind(String propertyKind)==");
        return em.createNamedQuery(Property.FIND_ALL_BY_PROPERTY_KIND)
                .setParameter("propertyKind", propertyKind)
                .getResultList();
    }

    @Override
    public List<Property> findAllByDistrictRegionAndKind(Long districtId, Long regionId, String propertyKind) {
        slf4jLogger.info("==List<Property> findAllByDistrictRegionAndKind(Long districtId, Long regionId, String propertyKind)==");

        return em.createNamedQuery(Property.FIND_ALL_BY_DISTRICT_AND_REGION_AND_KIND)
                .setParameter("districtId", districtId)
                .setParameter("regionId", regionId)
                .setParameter("propertyKind", propertyKind)
                .getResultList();
    }
}
