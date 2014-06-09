package com.homerenting.services;

import com.homerenting.domain.District;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

public interface IDistrictService {

    public District getById(Long id) throws NoResultException;

    public District getByName(String name) throws NoResultException;

    public List<District> getAllOrderedByName() throws NoResultException;

    public void save(District district);
}
