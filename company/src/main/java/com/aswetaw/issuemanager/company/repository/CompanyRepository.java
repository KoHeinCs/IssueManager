package com.aswetaw.issuemanager.company.repository;

import com.aswetaw.issuemanager.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 03/07/2022
 **/
@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {
}
