package com.homerenting.repo;

import com.homerenting.domain.Property;

import java.util.List;

//TODO JAVADOC
public interface IPropertyDao {

    public Property findById(Long id);

    public Property findByName(String name);

    public List<Property> findAllOrderedByName();

    public List<Property> findAllOrderedByNameDesc();

    public List<Property> findAllByNamePattern(String name);

    public void register(Property property);

}
