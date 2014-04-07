package com.homerenting.services;

import com.homerenting.domain.District;
import com.homerenting.repo.IDistrictDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class DistrictServiceImpl implements IDistrictService {

    private IDistrictDao districtDao;

    @Autowired
    public DistrictServiceImpl(IDistrictDao districtDao) {
        this.districtDao = districtDao;
    }

    @Override
    public District getById(Long id) {
        return districtDao.findById(id);
    }

    @Override
    public District getByName(String name) {
        return districtDao.findByName(name);
    }

    @Override
    public List<District> getAllOrderedByName() {
        return districtDao.findAllOrderedByName();
    }

    @Override
    public void save(District district) {
        districtDao.register(district);
    }
}
