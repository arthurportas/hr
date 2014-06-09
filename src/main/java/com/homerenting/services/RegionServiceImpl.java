package com.homerenting.services;

import com.homerenting.domain.Region;
import com.homerenting.repo.IRegionDao;
import com.homerenting.repo.RegionDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.List;

@Repository
public class RegionServiceImpl implements IRegionService {

    public static final String COMPONENT_NAME = "regionServiceImpl";

    @Qualifier(RegionDaoImpl.COMPONENT_NAME)
    @Autowired
    private IRegionDao regionDao;

    @Override
    public Region getById(Long id) throws NoResultException {
        return regionDao.findById(id);
    }

    @Override
    public Region getByName(String name) throws NoResultException{
        return regionDao.findByName(name);
    }

    @Override
    public List<Region> getAllOrderedByName() throws NoResultException{
        return regionDao.findAllOrderedByName();
    }

    @Override
    public List<Region> getAllOrderedByNameDesc() throws NoResultException{
        return regionDao.findAllOrderedByNameDesc();
    }

    @Override
    public List<Region> getAllByNamePattern(String name) throws NoResultException{
        return regionDao.findAllByNamePattern(name);
    }

    @Override
    public void save(Region region) {
        regionDao.register(region);
    }
}
