package com.homerenting.services;

import com.homerenting.domain.Apartment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IApartmentService {

    public Apartment getById(Long id);

    public void save(Apartment apartment);

    public List<Apartment> getHighlitedApartments();
}
