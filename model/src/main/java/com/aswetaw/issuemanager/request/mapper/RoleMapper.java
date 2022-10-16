package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.Role;
import com.aswetaw.issuemanager.request.dto.RoleDTO;
import org.mapstruct.Mapper;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Mapper(componentModel = "spring")
public interface RoleMapper extends BaseMapper<RoleDTO, Role> {
}
