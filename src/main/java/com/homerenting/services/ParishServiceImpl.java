package com.homerenting.services;

import com.homerenting.domain.Parish;
import com.homerenting.mvc.NewsController;
import com.homerenting.repo.IParishDao;
import com.homerenting.repo.ParishDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(ParishServiceImpl.COMPONENT_NAME)
@Transactional
public class ParishServiceImpl implements IParishService {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(NewsController.class);

    public static final String COMPONENT_NAME = "parishServiceImpl";

    @Qualifier(ParishDaoImpl.COMPONENT_NAME)
    @Autowired
    private IParishDao parishDao;

    @Override
    public Parish getById(Long id) {
        slf4jLogger.info("==Parish getById(Long id)==");
        return parishDao.findById(id);
    }

    @Override
    public Parish getByName(String name) {
        slf4jLogger.info("==Parish getByName(String name)==");
        return parishDao.findByName(name);
    }

    @Override
    public List<Parish> getAllOrderedByName() {
        slf4jLogger.info("==List<Parish> getAllOrderedByName()==");
        return parishDao.findAllOrderedByName();
    }

    @Override
    public void save(Parish parish) {
        slf4jLogger.info("==void save(Parish parish)==");
        parishDao.register(parish);
    }
}
