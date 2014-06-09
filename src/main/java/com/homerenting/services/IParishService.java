package com.homerenting.services;

import com.homerenting.domain.Parish;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

public interface IParishService {

    public Parish getById(final Long id) throws NoResultException;

    public Parish getByName(String name) throws NoResultException;

    public List<Parish> getAllOrderedByName() throws NoResultException;

    public void save(final Parish parish);
}
