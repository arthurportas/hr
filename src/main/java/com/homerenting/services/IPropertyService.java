package com.homerenting.services;

import com.homerenting.domain.Property;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

public interface IPropertyService {

    public Property getById(Long id) throws NoResultException;

    public Property getByName(String name) throws NoResultException;

    public List<Property> getAllOrderedByName() throws NoResultException;

    public List<Property> getAllOrderedByNameDesc() throws NoResultException;

    public List<Property> getAllByNamePattern(String name) throws NoResultException;

    public void save(Property property);

    public List<Property> getAllHighLighted() throws NoResultException;

    public List<Property> getRandomHighLighted() throws NoResultException;

    public List<Property> getAllByDistrict(final Long districtId) throws NoResultException;

    public List<Property> getAllByRegion(final Long regionId) throws NoResultException;

    public List<Property> getAllByDistrictAndRegion(Long districtId, Long regionId) throws NoResultException;

    public List<Property> getAllByPropertyKind(String propertyKind) throws NoResultException;

    public List<Property> getAllByDistrictRegionAndKind(final Long districtId, final Long regionId, String propertyKind) throws NoResultException;
}
