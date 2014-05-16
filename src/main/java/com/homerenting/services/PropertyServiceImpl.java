package com.homerenting.services;

import com.homerenting.domain.Property;
import com.homerenting.repo.IPropertyDao;
import com.homerenting.repo.PropertyDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PropertyServiceImpl implements IPropertyService {

    public static final String COMPONENT_NAME = "propertyServiceImpl";

    @Qualifier(PropertyDaoImpl.COMPONENT_NAME)
    @Autowired
    private IPropertyDao propertyDao;

    @Override
    public Property getById(Long id) {
        return propertyDao.findById(id);
    }

    @Override
    public Property getByName(String name) {
        return propertyDao.findByName(name);
    }

    @Override
    public List<Property> getAllOrderedByName() {
        return propertyDao.findAllOrderedByName();
    }

    @Override
    public List<Property> getAllOrderedByNameDesc() {
        return propertyDao.findAllOrderedByNameDesc();
    }

    @Override
    public List<Property> getAllByNamePattern(String name) {
        return propertyDao.findAllByNamePattern(name);
    }

    @Override
    public void save(Property property) {
        propertyDao.register(property);
    }
}
