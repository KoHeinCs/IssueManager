package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.Project;
import com.aswetaw.issuemanager.request.dto.ProjectDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Mapper(componentModel = "spring")
public interface ProjectMapper extends BaseMapper<ProjectDTO, Project>{
}
