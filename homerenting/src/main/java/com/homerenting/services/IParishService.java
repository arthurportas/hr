package com.homerenting.services;

import com.homerenting.domain.Parish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IParishService {

    public Parish getById(Long id);

    public Parish getByName(String name);

    public List<Parish> getAllOrderedByName();

    public void save(Parish parish);
}
