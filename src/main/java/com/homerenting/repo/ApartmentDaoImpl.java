package com.homerenting.repo;

import com.homerenting.domain.Apartment;
import com.homerenting.domain.Parish;
import org.hibernate.NonUniqueResultException;
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
import java.util.List;

@Repository(ApartmentDaoImpl.COMPONENT_NAME)
@Transactional(noRollbackFor={NoResultException.class, NonUniqueResultException.class})
public class ApartmentDaoImpl implements IApartmentDao {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ApartmentDaoImpl.class);

    public static final String COMPONENT_NAME = "apartmentDaoImpl";

    @Value("highlights.max.results")
    private static int MAX_RESULTS;

    @Autowired
    private EntityManager em;

    public Apartment findById(Long id) throws NoResultException {
        slf4jLogger.info("==Apartment findById(Long id)==");
        return em.find(Apartment.class, id);
    }

    public void register(Apartment apartment) {
        slf4jLogger.info("==void register(Apartment apartment)==");
        em.persist(apartment);
        return;
    }

    @Override
    public List<Apartment> fetchHighlitedApartments() throws NoResultException{
        slf4jLogger.info("==List<Apartment> fetchHighlitedApartments()==");
        return em.createNamedQuery(Apartment.FIND_ALL_HIGHLIGHTED)
                .setHint("org.hibernate.cacheable", Boolean.TRUE)
                .setMaxResults(MAX_RESULTS)
                .getResultList();
        //37 should be in config
    }
}
