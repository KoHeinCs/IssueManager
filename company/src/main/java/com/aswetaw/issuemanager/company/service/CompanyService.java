package com.aswetaw.issuemanager.company.service;

import com.aswetaw.issuemanager.company.repository.CompanyRepository;
import com.aswetaw.issuemanager.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class CompanyService implements ICompanyService{

    private final CompanyRepository companyRepo;

    @Override
    public void create(Company company) {
        companyRepo.save(company);
    }

    @Override
    public void update(Company company) {
        companyRepo.save(company);
    }

    @Override
    public void delete(Company company) {
        companyRepo.delete(company);
    }
}
