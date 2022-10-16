package com.aswetaw.issuemanager.issuepriority.service;

import com.aswetaw.issuemanager.issuepriority.repository.IssuePriorityRepository;
import com.aswetaw.issuemanager.entities.IssuePriority;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssuePriorityService implements IIssuePriorityService{
    private final IssuePriorityRepository issuePriorityRepo;
    @Override
    public void create(IssuePriority issuePriority) {
        issuePriorityRepo.save(issuePriority);
    }

    @Override
    public void update(IssuePriority issuePriority) {
        issuePriorityRepo.save(issuePriority);
    }

    @Override
    public void delete(IssuePriority issuePriority) {
        issuePriorityRepo.delete(issuePriority);
    }
}
