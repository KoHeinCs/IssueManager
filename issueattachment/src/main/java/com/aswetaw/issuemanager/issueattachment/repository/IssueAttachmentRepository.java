package com.aswetaw.issuemanager.issueattachment.repository;

import com.aswetaw.issuemanager.model.IssueAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Repository
public interface IssueAttachmentRepository extends JpaRepository<IssueAttachment,Long> {
}
