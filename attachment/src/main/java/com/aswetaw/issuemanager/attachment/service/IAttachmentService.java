package com.aswetaw.issuemanager.attachment.service;

import com.aswetaw.issuemanager.model.Attachment;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
public interface IAttachmentService {
    void create(Attachment attachment);
    void update(Attachment attachment);
    void delete(Attachment attachment);
}
