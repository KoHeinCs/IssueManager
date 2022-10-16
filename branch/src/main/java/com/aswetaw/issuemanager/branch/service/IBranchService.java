package com.aswetaw.issuemanager.branch.service;


import com.aswetaw.issuemanager.entities.Branch;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
public interface IBranchService {
    void create(Branch branch);
    void update(Branch branch);
    void delete(Branch branch);
}
