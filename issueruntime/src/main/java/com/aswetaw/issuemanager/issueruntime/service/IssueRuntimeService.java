package com.aswetaw.issuemanager.issueruntime.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.IssueRuntime;
import com.aswetaw.issuemanager.issueruntime.repository.IssueRuntimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueRuntimeService implements BaseService<IssueRuntime, Long> {
    private final IssueRuntimeRepository issueRuntimeRepo;

    @Override
    public IssueRuntime findById(Long id) {
        return issueRuntimeRepo.findById(id).get();
    }

    @Override
    public List<IssueRuntime> findAll() {
        return issueRuntimeRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        issueRuntimeRepo.deleteById(id);
    }

    @Override
    public void delete(IssueRuntime branch) {
        issueRuntimeRepo.delete(branch);
    }

    @Override
    public IssueRuntime save(IssueRuntime branch) {
        return issueRuntimeRepo.saveAndFlush(branch);
    }
}
