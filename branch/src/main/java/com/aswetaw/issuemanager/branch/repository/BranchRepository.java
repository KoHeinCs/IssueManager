package com.aswetaw.issuemanager.branch.repository;

import com.aswetaw.issuemanager.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Repository
public interface BranchRepository extends JpaRepository<Branch,Long> {
}
