package com.aswetaw.issuemanager.issue.service;

import com.aswetaw.issuemanager.model.Issue;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
public interface IIssueService {
    void create(Issue issue);
    void update(Issue issue);
    void delete(Issue issue);
}
