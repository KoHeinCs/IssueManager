package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.Department;
import com.aswetaw.issuemanager.request.dto.DepartmentDTO;
import org.mapstruct.Mapper;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Mapper(componentModel = "spring")
public interface DepartmentMapper extends BaseMapper<DepartmentDTO, Department> {
}
