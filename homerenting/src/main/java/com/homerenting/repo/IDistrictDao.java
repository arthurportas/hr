package com.homerenting.repo;

import com.homerenting.domain.District;

import java.util.List;

public interface IDistrictDao {

    public District findById(Long id);

    public District findByName(String name);

    public List<District> findAllOrderedByName();

    public void register(District district);
}
