package com.aswetaw.issuemanager.issueseverity.service;

import com.aswetaw.issuemanager.model.IssueSeverity;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
public interface IIssueSeverityService {
    void create(IssueSeverity issueSeverity);
    void update(IssueSeverity issueSeverity);
    void delete(IssueSeverity issueSeverity);
}
