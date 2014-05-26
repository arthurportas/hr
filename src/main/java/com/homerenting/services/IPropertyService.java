package com.homerenting.services;

import com.homerenting.domain.Property;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPropertyService {

    public Property getById(Long id);

    public Property getByName(String name);

    public List<Property> getAllOrderedByName();

    public List<Property> getAllOrderedByNameDesc();

    public List<Property> getAllByNamePattern(String name);

    public void save(Property property);

    public List<Property> getAllHighLighted();

    public List<Property> getRandomHighLighted();

    public List<Property> getAllByDistrict(final Long districtId);

    public List<Property> getAllByRegion(final Long regionId);

    public List<Property> getAllByDistrictAndRegion(Long districtId, Long regionId);

    public List<Property> getAllByPropertyKind(String propertyKind);

    public List<Property> getAllByDistrictRegionAndKind(final Long districtId, final Long regionId, String propertyKind);
}
