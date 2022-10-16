package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.Issue;
import com.aswetaw.issuemanager.request.dto.IssueDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Mapper(componentModel = "spring")
public interface IssueMapper extends BaseMapper<IssueDTO, Issue> {
    @Mapping(source = "branch",target = "branchDTO")
    @Mapping(source = "project",target = "projectDTO")
    @Mapping(source = "issuePriority",target = "issuePriorityDTO")
    @Mapping(source = "issueSeverity",target = "issueSeverityDTO")
    IssueDTO toDTO(Issue issue);

    @Mapping(source = "branchDTO",target = "branch")
    @Mapping(source = "projectDTO",target = "project")
    @Mapping(source = "issuePriorityDTO",target = "issuePriority")
    @Mapping(source = "issueSeverityDTO",target = "issueSeverity")
    Issue toEntity(IssueDTO dto);
}
