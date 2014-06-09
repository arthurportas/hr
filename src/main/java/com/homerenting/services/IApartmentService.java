package com.homerenting.services;

import com.homerenting.domain.Apartment;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

public interface IApartmentService {

    public Apartment getById(Long id) throws NoResultException;

    public void save(Apartment apartment);

    public List<Apartment> getHighlitedApartments() throws NoResultException;
}
