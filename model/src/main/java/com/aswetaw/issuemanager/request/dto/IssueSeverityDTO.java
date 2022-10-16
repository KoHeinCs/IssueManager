package com.aswetaw.issuemanager.request.dto;

import lombok.Data;

import javax.persistence.Column;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Data
public class IssueSeverityDTO {
    private Long id;
    private String name;
    private String description;
}
