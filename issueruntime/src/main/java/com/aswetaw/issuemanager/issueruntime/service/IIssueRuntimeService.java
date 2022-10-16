package com.aswetaw.issuemanager.issueruntime.service;

import com.aswetaw.issuemanager.entities.IssueRuntime;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
public interface IIssueRuntimeService {
    void create(IssueRuntime issueRuntime);
    void update(IssueRuntime issueRuntime);
    void delete(IssueRuntime issueRuntime);
}
