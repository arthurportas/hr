package com.homerenting.services;

import com.homerenting.domain.District;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDistrictService {

    public District getById(Long id);

    public District getByName(String name);

    public List<District> getAllOrderedByName();

    public void save(District district);
}
