package com.aswetaw.issuemanager.entities;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import com.aswetaw.issuemanager.enums.IssueStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Hein Htet Aung
 * @created at 02/07/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class Issue implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, unique = true, name = "issue_no")
    private Long issueNo;
    private String summary;
    private String description;
    @Column(name = "identified_date", nullable = false)
    private LocalDateTime identifiedDate;
    @Column(nullable = false, name = "target_resolved_date")
    private LocalDateTime targetResolvedDate;
    @Column(name = "actual_resolved_date")
    private LocalDateTime actualResolvedDate;
    @Column(name = "resolution_summary")
    private String resolutionSummary;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "issue_status")
    private IssueStatus issueStatus;

    /**
     * for relationships
     **/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "issue_priority_id", nullable = false)
    private IssuePriority issuePriority;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "issue_severity_id", nullable = false)
    private IssueSeverity issueSeverity;

    @OneToOne
    @JoinColumn(name = "assigned_by_user", nullable = false)
    private User assignedByUser;

    @OneToOne
    @JoinColumn(name = "assigned_to_user", nullable = false)
    private User assignedToUser;


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
