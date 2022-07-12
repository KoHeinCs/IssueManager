package com.aswetaw.issuemanager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Hein Htet Aung
 * @created at 02/07/2022
 **/
@Entity
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    private String description;
    @Column(nullable = false, name = "target_end_date")
    private LocalDateTime targetEndDate;
    @Column(name = "actual_end_date")
    private LocalDateTime actualEndDate;

    /** for relationships **/

    @Version
    private int version;
}
