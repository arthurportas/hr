package com.homerenting.repo;

import com.homerenting.domain.District;
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
public class IDistrictDaoImpl implements IDistrictDao {

    @Autowired
    private EntityManager em;

    public District findById(Long id) {
        return em.find(District.class, id);
    }

    public District findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<District> criteria = builder.createQuery(District.class);
        Root<District> district = criteria.from(District.class);

        criteria.select(district).where(builder.equal(district.get("name"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<District> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<District> criteria = cb.createQuery(District.class);
        Root<District> district = criteria.from(District.class);

        criteria.select(district).orderBy(cb.asc(district.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    public void register(District district) {
        em.persist(district);
        return;
    }
}
