package com.aswetaw.issuemanager.model;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Hein Htet Aung
 * @created at 02/07/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class Department implements IAudit{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    private String email;
    private String address;

    /** for relationships **/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;


    /** for audit log **/
    @Embedded
    Audit audit;

    /** for transaction concurrency control **/
    @Version
    private int version;
}
