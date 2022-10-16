package com.aswetaw.issuemanager.request.dto;

import com.aswetaw.issuemanager.enums.Position;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Data
public class UserDTO {
    private Long id;
    private String userName;
    private String password;
    private String employeeNo;
    private Position position;
    private String phone;
    private String email;
    private LocalDateTime joinDate;

    private DepartmentDTO departmentDTO;
    private RoleDTO roleDTO;
}
