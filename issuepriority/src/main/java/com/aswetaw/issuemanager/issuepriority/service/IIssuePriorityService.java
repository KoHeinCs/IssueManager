package com.aswetaw.issuemanager.issuepriority.service;

import com.aswetaw.issuemanager.entities.IssuePriority;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
public interface IIssuePriorityService {
    void create(IssuePriority issuePriority);
    void update(IssuePriority issuePriority);
    void delete(IssuePriority issuePriority);
}
