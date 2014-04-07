package com.homerenting.repo;

import com.homerenting.domain.Region;

import java.util.List;
//TODO JAVADOC
public interface IRegionDao {

    public Region findById(Long id);

    public Region findByName(String name);

    public List<Region> findAllOrderedByName();

    public List<Region> findAllOrderedByNameDesc();

    public List<Region> findAllByNamePattern(String name);

    public void register(Region region);

}
