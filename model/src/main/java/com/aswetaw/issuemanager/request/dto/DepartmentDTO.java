package com.aswetaw.issuemanager.request.dto;

import lombok.Data;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Data
public class DepartmentDTO {
    private Long id;
    private String name;
    private String description;
    private String email;
    private String address;
}
