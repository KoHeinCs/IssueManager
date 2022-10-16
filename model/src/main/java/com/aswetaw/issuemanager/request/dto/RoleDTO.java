package com.aswetaw.issuemanager.request.dto;

import com.aswetaw.issuemanager.enums.RoleType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Data
public class RoleDTO {
    private Long id;
    private String description;
    private RoleType roleType;
}
