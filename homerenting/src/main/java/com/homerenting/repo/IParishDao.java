package com.homerenting.repo;

import com.homerenting.domain.Parish;

import java.util.List;

public interface IParishDao {

    public Parish findById(Long id);

    public Parish findByName(String name);

    public List<Parish> findAllOrderedByName();

    public void register(Parish parish);
}
