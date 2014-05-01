package com.homerenting.repo;

import com.homerenting.domain.District;
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

@Repository(DistrictDaoImpl.COMPONENT_NAME)
@Transactional
public class DistrictDaoImpl implements IDistrictDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(DistrictDaoImpl.class);

    public static final String COMPONENT_NAME = "districtDaoImpl";

    @Autowired
    private EntityManager em;

    public District findById(Long id) {
        slf4jLogger.info("==District findById(Long id)==");
        return em.find(District.class, id);
    }

    public District findByName(String name) {
        slf4jLogger.info("==District findByName(String name)==");
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<District> criteria = builder.createQuery(District.class);
        Root<District> district = criteria.from(District.class);

        criteria.select(district).where(builder.equal(district.get("districtName"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<District> findAllOrderedByName() {
        slf4jLogger.info("==List<District> findAllOrderedByName()==");
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<District> criteria = cb.createQuery(District.class);
        Root<District> district = criteria.from(District.class);

        criteria.select(district).orderBy(cb.asc(district.get("districtName")));
        return em.createQuery(criteria).getResultList();
    }

    public void register(District district) {
        slf4jLogger.info("==void register(District district)==");
        em.persist(district);
        return;
    }
}
