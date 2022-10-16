package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.IssueSeverity;
import com.aswetaw.issuemanager.request.dto.IssueSeverityDTO;
import org.mapstruct.Mapper;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Mapper(componentModel = "spring")
public interface IssueSeverityMapper extends BaseMapper<IssueSeverityDTO, IssueSeverity>{
}
