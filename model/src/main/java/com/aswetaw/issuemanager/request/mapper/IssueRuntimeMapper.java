package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.IssueRuntime;
import com.aswetaw.issuemanager.request.dto.IssueRuntimeDTO;
import org.mapstruct.Mapper;

/**
 * @author Hein Htet Aung
 * @created at 02/11/2022
 **/
@Mapper(componentModel = "spring")
public interface IssueRuntimeMapper extends BaseMapper<IssueRuntimeDTO, IssueRuntime> {
}
