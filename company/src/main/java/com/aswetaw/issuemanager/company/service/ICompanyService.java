package com.aswetaw.issuemanager.company.service;

import com.aswetaw.issuemanager.model.Company;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
public interface ICompanyService {
    void create(Company company);
    void update(Company company);
    void delete(Company company);
}
