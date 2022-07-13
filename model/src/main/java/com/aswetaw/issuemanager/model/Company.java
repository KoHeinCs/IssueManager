package com.aswetaw.issuemanager.model;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Hein Htet Aung
 * @created at 02/07/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class Company implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    private String phone;
    private String email;
    private String address;

    /** for relationships **/
    @OneToMany(mappedBy = "company",cascade = {CascadeType.MERGE,CascadeType.PERSIST},orphanRemoval = true)
    private Set<Department> departments;


    public void addDepartment(Department department){
        if (departments == null)
            departments = new HashSet<>();
        departments.add(department);
        department.setCompany(this);
    }

    /** for audit log **/
    @Embedded
    Audit audit;

    /** for transaction concurrency control **/
    @Version
    private int version;
}
