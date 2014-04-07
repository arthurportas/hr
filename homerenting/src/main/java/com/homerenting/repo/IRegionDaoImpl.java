package com.homerenting.repo;

import com.homerenting.domain.Region;
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
public class IRegionDaoImpl implements IRegionDao {

    @Autowired
    private EntityManager em;

    public Region findById(Long id) {
        return em.find(Region.class, id);
    }

    public Region findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Region> criteria = builder.createQuery(Region.class);
        Root<Region> region = criteria.from(Region.class);

        criteria.select(region).where(builder.equal(region.get("name"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Region> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Region> criteria = cb.createQuery(Region.class);
        Root<Region> region = criteria.from(Region.class);

        criteria.select(region).orderBy(cb.asc(region.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Region> findAllOrderedByNameDesc() {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Region> criteria = cb.createQuery(Region.class);
        Root<Region> region = criteria.from(Region.class);

        criteria.select(region).orderBy(cb.desc(region.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Region> findAllByNamePattern(String name) {
        return em.createNamedQuery(Region.FIND_BY_NAME_PATTERN)
                .setParameter("regionName",  "%" + name + "%").getResultList();
    }

    public void register(Region region) {
        em.persist(region);
        return;
    }
}
