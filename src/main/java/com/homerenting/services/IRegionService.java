package com.homerenting.services;

import com.homerenting.domain.Region;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

public interface IRegionService {

    public Region getById(Long id) throws NoResultException;

    public Region getByName(String name) throws NoResultException;

    public List<Region> getAllOrderedByName() throws NoResultException;

    public List<Region> getAllOrderedByNameDesc() throws NoResultException;

    public List<Region> getAllByNamePattern(String name) throws NoResultException;

    public void save(Region region);

}
