package com.homerenting.services;

import com.homerenting.domain.CompanyMOTD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICompanyMOTDService {

    public CompanyMOTD getById(Long id);

    public CompanyMOTD getByName(String name);

    public List<CompanyMOTD> getAllOrderedByName();

    public void save(CompanyMOTD motd);
}
