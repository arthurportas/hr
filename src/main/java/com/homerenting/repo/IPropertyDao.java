package com.homerenting.repo;

import com.homerenting.domain.Property;
import com.homerenting.domain.modules.header.search.PropertyKind;

import java.util.List;

//TODO JAVADOC
public interface IPropertyDao {

    public Property findById(Long id);

    public Property findByName(String name);

    public List<Property> findAllOrderedByName();

    public List<Property> findAllOrderedByNameDesc();

    public List<Property> findAllByNamePattern(String name);

    public void register(Property property);

    public List<Property> findAllHighLighted();

    public List<Property> findAllByDistrict(final Long districtId);

    public List<Property> findAllByRegion(final Long regionId);

    public List<Property> findAllByDistrictAndRegion(final Long districtId, final Long regionId);

    public List<Property> findAllByPropertyKind(final String propertyKind);

    public List<Property> findAllByDistrictRegionAndKind(Long districtId, Long regionId, String propertyKind);

}
