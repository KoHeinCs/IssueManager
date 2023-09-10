package com.aswetaw.issuemanager.entities;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import com.aswetaw.issuemanager.enums.IssueStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Hein Htet Aung
 * @created at 03/07/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class IssueHistory implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "issue_no", unique = true, nullable = false)
    private Long issueNo;
    @Column(name = "issue_severity", nullable = false)
    private String issueSeverity;
    @Column(name = "issue_priority")
    private String issuePriority;
    private String summary;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "issue_status")
    private IssueStatus issueStatus;

    /**
     * for audit log
     **/
    @Embedded
    Audit audit;

    /**
     * for transaction concurrency control
     **/
    @Version
    private int version;
}
