package com.homerenting.services;

import com.homerenting.domain.CompanyMOTD;
import com.homerenting.domain.District;
import com.homerenting.repo.CompanyMOTDDaoImpl;
import com.homerenting.repo.ICompanyMOTDDao;
import com.homerenting.repo.IDistrictDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.List;

@Repository(CompanyMOTDServiceImpl.COMPONENT_NAME)
public class CompanyMOTDServiceImpl implements ICompanyMOTDService {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(CompanyMOTDServiceImpl.class);

    public static final String COMPONENT_NAME = "companyMOTDService";

    @Qualifier(CompanyMOTDDaoImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDDao companyMOTDDao;

    @Override
    public CompanyMOTD getById(Long id) throws NoResultException {
        slf4jLogger.info("==CompanyMOTD getById(Long id)==");
        return companyMOTDDao.findById(id);
    }

    @Override
    public CompanyMOTD getByName(String name) throws NoResultException{
        slf4jLogger.info("==CompanyMOTD getByName(String name)==");
        return companyMOTDDao.findByName(name);
    }

    @Override
    public List<CompanyMOTD> getAllOrderedByName() throws NoResultException{
        slf4jLogger.info("==List<CompanyMOTD> getAllOrderedByName()==");
        return companyMOTDDao.findAllOrderedByName();
    }

    @Override
    public void save(CompanyMOTD motd) {
        slf4jLogger.info("==void save(CompanyMOTD motd)==");
        companyMOTDDao.register(motd);
    }
}
