package com.homerenting.repo;

import com.homerenting.domain.CompanyMOTD;
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

@Repository(CompanyMOTDDaoImpl.COMPONENT_NAME)
@Transactional
public class CompanyMOTDDaoImpl implements ICompanyMOTDDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(CompanyMOTDDaoImpl.class);

    public static final String COMPONENT_NAME = "companyMOTDDao";

    @Autowired
    private EntityManager em;

    public CompanyMOTD findById(Long id) {
        return em.find(CompanyMOTD.class, id);
    }

    public CompanyMOTD findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<CompanyMOTD> criteria = builder.createQuery(CompanyMOTD.class);
        Root<CompanyMOTD> motd = criteria.from(CompanyMOTD.class);

        criteria.select(motd).where(builder.equal(motd.get("motd"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<CompanyMOTD> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<CompanyMOTD> criteria = cb.createQuery(CompanyMOTD.class);
        Root<CompanyMOTD> motd = criteria.from(CompanyMOTD.class);

        criteria.select(motd).orderBy(cb.asc(motd.get("motd")));
        return em.createQuery(criteria).getResultList();
    }

    public void register(CompanyMOTD motd) {
        em.persist(motd);
        return;
    }
}
