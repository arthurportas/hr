package com.homerenting.services;

import com.homerenting.domain.Region;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRegionService {

    public Region getById(Long id);

    public Region getByName(String name);

    public List<Region> getAllOrderedByName();

    public List<Region> getAllOrderedByNameDesc();

    public List<Region> getAllByNamePattern(String name);

    public void save(Region region);

}
