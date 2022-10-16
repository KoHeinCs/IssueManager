package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.IssuePriority;
import com.aswetaw.issuemanager.request.dto.IssuePriorityDTO;
import org.mapstruct.Mapper;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Mapper(componentModel = "spring")
public interface IssuePriorityMapper extends BaseMapper<IssuePriorityDTO, IssuePriority> {
}
