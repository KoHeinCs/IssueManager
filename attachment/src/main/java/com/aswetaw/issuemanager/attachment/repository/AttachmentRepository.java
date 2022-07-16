package com.aswetaw.issuemanager.attachment.repository;

import com.aswetaw.issuemanager.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Long> {
}
