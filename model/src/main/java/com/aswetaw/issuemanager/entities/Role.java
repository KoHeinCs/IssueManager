package com.aswetaw.issuemanager.entities;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import com.aswetaw.issuemanager.enums.RoleType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Hein Htet Aung
 * @created at 01/07/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class Role implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,unique = true,name = "role_type")
    private RoleType roleType;


    /** for relationships **/

    /** for audit log **/
    @Embedded
    Audit audit;

    /** for transaction concurrency control **/
    @Version
    private int version;
}
