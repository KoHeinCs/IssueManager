package com.aswetaw.issuemanager.attachment.service;

import com.aswetaw.issuemanager.attachment.repository.AttachmentRepository;
import com.aswetaw.issuemanager.model.Attachment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class AttachmentService implements IAttachmentService{
    private final AttachmentRepository attachmentRepo;

    @Override
    public void create(Attachment attachment) {
        attachmentRepo.save(attachment);
    }

    @Override
    public void update(Attachment attachment) {
        attachmentRepo.save(attachment);
    }

    @Override
    public void delete(Attachment attachment) {
        attachmentRepo.delete(attachment);
    }
}
