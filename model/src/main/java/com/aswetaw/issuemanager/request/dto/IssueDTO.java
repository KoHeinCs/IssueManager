package com.aswetaw.issuemanager.request.dto;

import com.aswetaw.issuemanager.enums.IssueStatus;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Data
public class IssueDTO {

    private Long id;
    private Long issueNo;
    private String summary;
    private String description;
    private LocalDateTime identifiedDate;
    private LocalDateTime targetResolvedDate;
    private LocalDateTime actualResolvedDate;
    private String resolutionSummary;
    private IssueStatus issueStatus;
    private BranchDTO branchDTO;
    private ProjectDTO projectDTO;
    private IssuePriorityDTO issuePriorityDTO;
    private IssueSeverityDTO issueSeverityDTO;
}
