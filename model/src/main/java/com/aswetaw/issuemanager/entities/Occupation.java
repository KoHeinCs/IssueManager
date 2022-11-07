package com.aswetaw.issuemanager.entities;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Hein Htet Aung
 * @created at 17/10/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class Occupation implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String description;

    public Occupation() {
    }

    public Occupation(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /** for relationships **/


    /**
     * for audit log
     **/
    @Embedded
    Audit audit;

    /**
     * for transaction concurrency control
     **/
    @Version
    private int version;
}
