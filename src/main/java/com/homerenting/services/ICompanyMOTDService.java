package com.homerenting.services;

import com.homerenting.domain.CompanyMOTD;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

public interface ICompanyMOTDService {

    public CompanyMOTD getById(Long id) throws NoResultException;

    public CompanyMOTD getByName(String name) throws NoResultException;

    public List<CompanyMOTD> getAllOrderedByName() throws NoResultException;

    public void save(CompanyMOTD motd);
}
