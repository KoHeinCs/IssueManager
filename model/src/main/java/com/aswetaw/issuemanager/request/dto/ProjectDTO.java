package com.aswetaw.issuemanager.request.dto;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDateTime;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Data
public class ProjectDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime targetEndDate;
    private LocalDateTime actualEndDate;
}
