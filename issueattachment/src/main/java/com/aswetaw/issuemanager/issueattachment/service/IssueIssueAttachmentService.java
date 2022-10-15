package com.aswetaw.issuemanager.issueattachment.service;

import com.aswetaw.issuemanager.issueattachment.repository.IssueAttachmentRepository;
import com.aswetaw.issuemanager.model.IssueAttachment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueIssueAttachmentService implements IIssueAttachmentService {
    private final IssueAttachmentRepository attachmentRepo;

    @Override
    public void create(IssueAttachment issueAttachment) {
        attachmentRepo.save(issueAttachment);
    }

    @Override
    public void update(IssueAttachment issueAttachment) {
        attachmentRepo.save(issueAttachment);
    }

    @Override
    public void delete(IssueAttachment issueAttachment) {
        attachmentRepo.delete(issueAttachment);
    }
}
