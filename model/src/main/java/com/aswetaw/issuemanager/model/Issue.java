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
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, unique = true)
    private Long issueNo;
    private String summary;
    private String description;
    @Column(name = "identified_date",nullable = false)
    private LocalDateTime identifiedDate;
    @Column(nullable = false, name = "target_resolved_date")
    private LocalDateTime targetResolvedDate;
    @Column(name = "actual_resolved_date")
    private LocalDateTime actualResolvedDate;
    @Column(name = "resolution_summary")
    private String resolutionSummary;

    /** for relationships **/

    @Version
    private int version;


}
