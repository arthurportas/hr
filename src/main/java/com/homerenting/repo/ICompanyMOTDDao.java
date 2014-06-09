package com.homerenting.repo;

import com.homerenting.domain.CompanyMOTD;

import javax.persistence.NoResultException;
import java.util.List;

public interface ICompanyMOTDDao {

    public CompanyMOTD findById(Long id) throws NoResultException;

    public CompanyMOTD findByName(String name) throws NoResultException;

    public List<CompanyMOTD> findAllOrderedByName() throws NoResultException;

    public void register(CompanyMOTD motd);
}
