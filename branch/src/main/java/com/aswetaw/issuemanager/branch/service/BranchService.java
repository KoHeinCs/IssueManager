package com.aswetaw.issuemanager.branch.service;

import com.aswetaw.issuemanager.branch.repository.BranchRepository;
import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.Branch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class BranchService implements BaseService<Branch,Long> {
    private final BranchRepository branchRepo;

    @Override
    public Branch findById(Long id) {
        return branchRepo.findById(id).get();
    }

    @Override
    public List<Branch> findAll() {
        return branchRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        branchRepo.deleteById(id);
    }

    @Override
    public void delete(Branch branch) {
        branchRepo.delete(branch);
    }

    @Override
    public Branch save(Branch branch) {
        return branchRepo.saveAndFlush(branch);
    }
}
