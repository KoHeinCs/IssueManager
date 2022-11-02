package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.IssueHistory;
import com.aswetaw.issuemanager.request.dto.IssueHistoryDTO;
import org.mapstruct.Mapper;

/**
 * @author Hein Htet Aung
 * @created at 02/11/2022
 **/
@Mapper(componentModel = "spring")
public interface IssueHistoryMapper extends BaseMapper<IssueHistoryDTO, IssueHistory> {
}
