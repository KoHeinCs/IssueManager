package com.aswetaw.issuemanager.branch.service;

import com.aswetaw.issuemanager.branch.repository.BranchRepository;
import com.aswetaw.issuemanager.model.Branch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class BranchService implements IBranchService{
    private final BranchRepository branchRepo;

    @Override
    public void create(Branch branch) {
        branchRepo.save(branch);
    }

    @Override
    public void update(Branch branch) {
        branchRepo.save(branch);
    }

    @Override
    public void delete(Branch branch) {
        branchRepo.delete(branch);
    }
}
