package com.homerenting.services;

import com.homerenting.domain.District;
import com.homerenting.mvc.AnnounceController;
import com.homerenting.mvc.DistrictController;
import com.homerenting.repo.DistrictDaoImpl;
import com.homerenting.repo.IDistrictDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(DistrictServiceImpl.COMPONENT_NAME)
@Transactional
public class DistrictServiceImpl implements IDistrictService {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(DistrictServiceImpl.class);

    public static final String COMPONENT_NAME = "districtServiceImpl";

    @Qualifier(DistrictDaoImpl.COMPONENT_NAME)
    @Autowired
    private IDistrictDao districtDao;

    @Override
    public District getById(Long id) {
        slf4jLogger.info("==District getById(Long id)==");
        return districtDao.findById(id);
    }

    @Override
    public District getByName(String name) {
        slf4jLogger.info("==District getByName(String name)==");
        return districtDao.findByName(name);
    }

    @Override
    public List<District> getAllOrderedByName() {
        slf4jLogger.info("==List<District> getAllOrderedByName()==");
        return districtDao.findAllOrderedByName();
    }

    @Override
    public void save(District district) {
        slf4jLogger.info("==void save(District district)==");
        districtDao.register(district);
    }
}
