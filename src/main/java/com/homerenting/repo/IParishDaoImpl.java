package com.homerenting.repo;

import com.homerenting.domain.Parish;
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
public class IParishDaoImpl implements IParishDao {

    @Autowired
    private EntityManager em;

    public Parish findById(Long id) {
        return em.find(Parish.class, id);
    }

    public Parish findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Parish> criteria = builder.createQuery(Parish.class);
        Root<Parish> parish = criteria.from(Parish.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        criteria.select(parish).where(builder.equal(parish.get("name"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Parish> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Parish> criteria = cb.createQuery(Parish.class);
        Root<Parish> parish = criteria.from(Parish.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        criteria.select(parish).orderBy(cb.asc(parish.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    public void register(Parish parish) {
        em.persist(parish);
        return;
    }
}
