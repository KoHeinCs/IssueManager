package com.aswetaw.issuemanager.model;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    @Column(nullable = false, unique = true)
    private Long issueNo;
    private String summary;
    private String description;
    @Column(name = "identified_date",nullable = false)
    private LocalDateTime identifiedDate;
    @Column(nullable = false, name = "target_resolved_date")
    private LocalDateTime targetResolvedDate;
    @Column(name = "actual_resolved_date")
    private LocalDateTime actualResolvedDate;
    @Column(name = "resolution_summary")
    private String resolutionSummary;

    /** for relationships **/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id",nullable = false)
    private Branch branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id",nullable = false)
    private Project project;

    @OneToMany(mappedBy = "issue",cascade = {CascadeType.MERGE,CascadeType.PERSIST},orphanRemoval = true)
    private List<IssueHistory> issueHistoryList;

    @OneToOne(mappedBy = "issue",cascade = {CascadeType.PERSIST},orphanRemoval = true)
    private IssueRuntime issueRuntime;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "issue_priority_id",nullable = false)
    private IssuePriority issuePriority;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "issue_severity_id",nullable = false)
    private IssueSeverity issueSeverity;


    public void addIssueHistory(IssueHistory issueHistory){
        if (issueHistoryList == null)
            issueHistoryList = new ArrayList<>();
        issueHistoryList.add(issueHistory);
        issueHistory.setIssue(this);
    }

    public void addIssueRuntime(IssueRuntime issueRuntime){
        issueRuntime.setIssue(this);
    }

    /** for audit log **/
    @Embedded
    Audit audit;

    /** for transaction concurrency control **/
    @Version
    private int version;


}
