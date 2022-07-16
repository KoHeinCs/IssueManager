package com.aswetaw.issuemanager.issuehistory.service;

import com.aswetaw.issuemanager.model.IssueHistory;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
public interface IIssueHistoryService {
    void create(IssueHistory issueHistory);
    void update(IssueHistory issueHistory);
    void delete(IssueHistory issueHistory);
}
