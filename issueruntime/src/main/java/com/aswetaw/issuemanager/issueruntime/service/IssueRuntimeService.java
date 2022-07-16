package com.aswetaw.issuemanager.issueruntime.service;

import com.aswetaw.issuemanager.issueruntime.repository.IssueRuntimeRepository;
import com.aswetaw.issuemanager.model.IssueRuntime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueRuntimeService implements IIssueRuntimeService{
    private final IssueRuntimeRepository issueRuntimeRepo;

    @Override
    public void create(IssueRuntime issueRuntime) {
        issueRuntimeRepo.save(issueRuntime);
    }

    @Override
    public void update(IssueRuntime issueRuntime) {
        issueRuntimeRepo.save(issueRuntime);
    }

    @Override
    public void delete(IssueRuntime issueRuntime) {
        issueRuntimeRepo.delete(issueRuntime);
    }
}
