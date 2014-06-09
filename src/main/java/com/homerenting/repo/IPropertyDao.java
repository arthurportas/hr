package com.homerenting.repo;

import com.homerenting.domain.Property;

import javax.persistence.NoResultException;
import java.util.List;

//TODO JAVADOC
public interface IPropertyDao {

    public Property findById(Long id) throws NoResultException;

    public Property findByName(String name) throws NoResultException;

    public List<Property> findAllOrderedByName() throws NoResultException;

    public List<Property> findAllOrderedByNameDesc() throws NoResultException;

    public List<Property> findAllByNamePattern(String name) throws NoResultException;

    public void register(Property property);

    public List<Property> findAllHighLighted() throws NoResultException;

    public List<Property> findAllByDistrict(final Long districtId) throws NoResultException;

    public List<Property> findAllByRegion(final Long regionId) throws NoResultException;

    public List<Property> findAllByDistrictAndRegion(final Long districtId, final Long regionId) throws NoResultException;

    public List<Property> findAllByPropertyKind(final String propertyKind) throws NoResultException;

    public List<Property> findAllByDistrictRegionAndKind(Long districtId, Long regionId, String propertyKind) throws NoResultException;

}
