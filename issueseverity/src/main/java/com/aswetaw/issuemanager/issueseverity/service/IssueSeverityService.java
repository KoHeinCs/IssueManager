package com.aswetaw.issuemanager.issueseverity.service;

import com.aswetaw.issuemanager.issueseverity.repository.IssueSeverityRepository;
import com.aswetaw.issuemanager.model.IssueSeverity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueSeverityService implements IIssueSeverityService{
    private final IssueSeverityRepository issueSeverityRepo;

    @Override
    public void create(IssueSeverity issueSeverity) {
        issueSeverityRepo.save(issueSeverity);
    }

    @Override
    public void update(IssueSeverity issueSeverity) {
        issueSeverityRepo.save(issueSeverity);
    }

    @Override
    public void delete(IssueSeverity issueSeverity) {
        issueSeverityRepo.delete(issueSeverity);
    }
}
