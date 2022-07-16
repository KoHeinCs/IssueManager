package com.aswetaw.issuemanager.issue.service;

import com.aswetaw.issuemanager.issue.repository.IssueRepository;
import com.aswetaw.issuemanager.model.Issue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueService implements IIssueService{
    private final IssueRepository issueRepository;

    @Override
    public void create(Issue issue) {
        issueRepository.save(issue);
    }

    @Override
    public void update(Issue issue) {
        issueRepository.save(issue);
    }

    @Override
    public void delete(Issue issue) {
        issueRepository.delete(issue);
    }
}
