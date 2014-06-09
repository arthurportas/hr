package com.homerenting.repo;

import com.homerenting.domain.District;

import javax.persistence.NoResultException;
import java.util.List;

public interface IDistrictDao {

    public District findById(Long id) throws NoResultException;

    public District findByName(String name) throws NoResultException;

    public List<District> findAllOrderedByName() throws NoResultException;

    public void register(District district);
}
