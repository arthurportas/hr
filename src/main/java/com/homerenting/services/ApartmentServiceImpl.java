package com.homerenting.services;

import com.homerenting.domain.Apartment;
import com.homerenting.repo.ApartmentDaoImpl;
import com.homerenting.repo.IApartmentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.List;

@Service(ApartmentServiceImpl.COMPONENT_NAME)
public class ApartmentServiceImpl implements IApartmentService {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ApartmentServiceImpl.class);

    public static final String COMPONENT_NAME = "apartmentServiceImpl";

    @Qualifier(ApartmentDaoImpl.COMPONENT_NAME)
    @Autowired
    private IApartmentDao apartmentDao;

    @Override
    public Apartment getById(Long id) throws NoResultException {
        slf4jLogger.info("==Apartment getById(Long id)==");
        return apartmentDao.findById(id);
    }

    @Override
    public void save(Apartment apartment) {
        slf4jLogger.info("==void save(Apartment apartment)==");
        apartmentDao.register(apartment);
    }

    @Override
    public List<Apartment> getHighlitedApartments() throws NoResultException{
        slf4jLogger.info("==List<Apartment> getHighlitedApartments()==");
        return apartmentDao.fetchHighlitedApartments();
    }
}
