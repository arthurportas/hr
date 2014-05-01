package com.homerenting.repo;

import com.homerenting.domain.CompanyMOTD;

import java.util.List;

public interface ICompanyMOTDDao {

    public CompanyMOTD findById(Long id);

    public CompanyMOTD findByName(String name);

    public List<CompanyMOTD> findAllOrderedByName();

    public void register(CompanyMOTD motd);
}
