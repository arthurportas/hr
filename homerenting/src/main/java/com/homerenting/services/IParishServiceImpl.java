package com.homerenting.services;

import com.homerenting.domain.Parish;
import com.homerenting.repo.IParishDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class IParishServiceImpl implements IParishService {

    private IParishDao parishDao;

    @Autowired
    public IParishServiceImpl(IParishDao parishDao) {
        this.parishDao = parishDao;
    }

    @Override
    public Parish getById(Long id) {
        return parishDao.findById(id);
    }

    @Override
    public Parish getByName(String name) {
        return parishDao.findByName(name);
    }

    @Override
    public List<Parish> getAllOrderedByName() {
        return parishDao.findAllOrderedByName();
    }

    @Override
    public void save(Parish parish) {
        parishDao.register(parish);
    }
}
