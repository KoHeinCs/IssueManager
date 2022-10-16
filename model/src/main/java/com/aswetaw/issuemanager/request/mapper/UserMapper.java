package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.User;
import com.aswetaw.issuemanager.request.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<UserDTO, User> {
    @Mapping(source = "departmentDTO",target = "department")
    @Mapping(source = "roleDTO",target = "role")
    User toEntity(UserDTO dto);

    @Mapping(source = "department",target = "departmentDTO")
    @Mapping(source = "role",target = "roleDTO")
    UserDTO toDTO(User entity);
}
