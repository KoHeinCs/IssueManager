package com.aswetaw.issuemanager.entities;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Hein Htet Aung
 * @created at 02/07/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class IssuePriority implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;

    public IssuePriority() {
    }

    public IssuePriority(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * for relationships
     **/
    @OneToOne(mappedBy = "issuePriority")
    private Issue issue;

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
