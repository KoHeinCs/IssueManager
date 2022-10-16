package com.aswetaw.issuemanager.issuehistory.service;

import com.aswetaw.issuemanager.issuehistory.repository.IssueHistoryRepository;
import com.aswetaw.issuemanager.entities.IssueHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueHistoryService implements IIssueHistoryService{
    private final IssueHistoryRepository issueHistoryRepo;

    @Override
    public void create(IssueHistory issueHistory) {
        issueHistoryRepo.save(issueHistory);
    }

    @Override
    public void update(IssueHistory issueHistory) {
        issueHistoryRepo.save(issueHistory);
    }

    @Override
    public void delete(IssueHistory issueHistory) {
        issueHistoryRepo.delete(issueHistory);
    }
}
