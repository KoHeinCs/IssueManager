package com.aswetaw.issuemanager.issueattachment.service;

import com.aswetaw.issuemanager.model.IssueAttachment;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
public interface IIssueAttachmentService {
    void create(IssueAttachment issueAttachment);
    void update(IssueAttachment issueAttachment);
    void delete(IssueAttachment issueAttachment);
}
