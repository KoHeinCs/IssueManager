package com.aswetaw.issuemanager.model;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Hein Htet Aung
 * @created at 13/07/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class IssueAttachment implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;

    @Column(nullable = false,name = "name")
    private String name;

    @Column(nullable = false,name = "file_path")
    private String filePath;

    /** for audit log **/
    @Embedded
    Audit audit;

    /** for transaction concurrency control **/
    @Version
    private int version;
}
