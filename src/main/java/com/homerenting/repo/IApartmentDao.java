package com.homerenting.repo;

import com.homerenting.domain.Apartment;

import javax.persistence.NoResultException;
import java.util.List;

public interface IApartmentDao {

    public Apartment findById(Long id) throws NoResultException;

    public void register(Apartment apartment);

    public List<Apartment> fetchHighlitedApartments() throws NoResultException;
}
