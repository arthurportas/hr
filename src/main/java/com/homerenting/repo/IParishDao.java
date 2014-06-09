package com.homerenting.repo;

import com.homerenting.domain.Parish;

import javax.persistence.NoResultException;
import java.util.List;

public interface IParishDao {

    public Parish findById(Long id) throws NoResultException;

    public Parish findByName(String name) throws NoResultException;

    public List<Parish> findAllOrderedByName() throws NoResultException;

    public void register(Parish parish);
}
