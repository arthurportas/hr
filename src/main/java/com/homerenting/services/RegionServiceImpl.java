package com.homerenting.services;

import com.homerenting.domain.Region;
import com.homerenting.repo.IRegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RegionServiceImpl implements IRegionService {

    private IRegionDao regionDao;

    @Autowired
    public RegionServiceImpl(IRegionDao regionDao) {
        this.regionDao = regionDao;
    }

    @Override
    public Region getById(Long id) {
        return regionDao.findById(id);
    }

    @Override
    public Region getByName(String name) {
        return regionDao.findByName(name);
    }

    @Override
    public List<Region> getAllOrderedByName() {
        return regionDao.findAllOrderedByName();
    }

    @Override
    public List<Region> getAllOrderedByNameDesc() {
        return regionDao.findAllOrderedByNameDesc();
    }

    @Override
    public List<Region> getAllByNamePattern(String name) {
        return regionDao.findAllByNamePattern(name);
    }

    @Override
    public void save(Region region) {
        regionDao.register(region);
    }
}
