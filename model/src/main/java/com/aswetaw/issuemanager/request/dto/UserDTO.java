package com.aswetaw.issuemanager.request.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String employeeNo;
    private String phone;
    private String email;
    private LocalDateTime joinDate;
    private Boolean isActive;
    private Boolean isNotLocked;

    private DepartmentDTO departmentDTO;
    private RoleDTO roleDTO;
    private OccupationDTO occupationDTO;
}
