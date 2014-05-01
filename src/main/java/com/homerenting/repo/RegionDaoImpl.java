package com.homerenting.repo;

import com.homerenting.domain.Region;
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

@Repository(RegionDaoImpl.COMPONENT_NAME)
@Transactional
public class RegionDaoImpl implements IRegionDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(RegionDaoImpl.class);

    public static final String COMPONENT_NAME = "regionDaoImpl";

    @Autowired
    private EntityManager em;

    public Region findById(Long id) {
        slf4jLogger.info("==Region findById(Long id)==");
        return em.find(Region.class, id);
    }

    public Region findByName(String name) {
        slf4jLogger.info("==Region findByName(String name)==");
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Region> criteria = builder.createQuery(Region.class);
        Root<Region> region = criteria.from(Region.class);

        criteria.select(region).where(builder.equal(region.get("name"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Region> findAllOrderedByName() {
        slf4jLogger.info("==List<Region> findAllOrderedByName()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Region> criteria = cb.createQuery(Region.class);
        Root<Region> region = criteria.from(Region.class);

        criteria.select(region).orderBy(cb.asc(region.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Region> findAllOrderedByNameDesc() {
        slf4jLogger.info("==List<Region> findAllOrderedByNameDesc()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Region> criteria = cb.createQuery(Region.class);
        Root<Region> region = criteria.from(Region.class);

        criteria.select(region).orderBy(cb.desc(region.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Region> findAllByNamePattern(String name) {
        slf4jLogger.info("==List<Region> findAllByNamePattern(String name)==");
        return em.createNamedQuery(Region.FIND_BY_NAME_PATTERN)
                .setParameter("regionName",  "%" + name + "%").getResultList();
    }

    public void register(Region region) {
        slf4jLogger.info("==void register(Region region)==");
        em.persist(region);
        return;
    }
}
