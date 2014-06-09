package com.homerenting.repo;

import com.homerenting.domain.Region;

import javax.persistence.NoResultException;
import java.util.List;
//TODO JAVADOC
public interface IRegionDao {

    public Region findById(Long id) throws NoResultException;

    public Region findByName(String name) throws NoResultException;

    public List<Region> findAllOrderedByName() throws NoResultException;

    public List<Region> findAllOrderedByNameDesc() throws NoResultException;

    public List<Region> findAllByNamePattern(String name) throws NoResultException;

    public void register(Region region);

}
