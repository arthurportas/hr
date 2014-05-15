package com.homerenting.repo;

import com.homerenting.domain.Apartment;

import java.util.List;

public interface IApartmentDao {

    public Apartment findById(Long id);

    public void register(Apartment apartment);

    public List<Apartment> fetchHighlitedApartments();
}
