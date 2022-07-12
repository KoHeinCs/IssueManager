package com.aswetaw.issuemanager.model;

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
public class IssueHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "issue_no",unique = true,nullable = false)
    private Long issueNo;
    @Column(name = "issue_severity",nullable = false)
    private String issueSeverity;
    @Column(name = "issue_priority")
    private String issuePriority;
    private String summary;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private IssueStatus status;

    /** for relationships **/

    @Version
    private int version;
}
