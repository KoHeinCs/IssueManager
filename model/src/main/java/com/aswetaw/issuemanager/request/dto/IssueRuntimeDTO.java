package com.aswetaw.issuemanager.request.dto;

import com.aswetaw.issuemanager.enums.IssueStatus;
import lombok.Data;

/**
 * @author Hein Htet Aung
 * @created at 02/11/2022
 **/
@Data
public class IssueRuntimeDTO {
    private Long id;
    private Long issueNo;
    private String issueSeverity;
    private String issuePriority;
    private String summary;
    private IssueStatus statusStatus;
}
