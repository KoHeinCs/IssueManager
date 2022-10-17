package com.aswetaw.issuemanager.entities;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Hein Htet Aung
 * @created at 27/06/2022
 **/
@Entity
@Getter
@Setter
@EntityListeners(AuditListener.class)
public class User implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, name = "user_name")
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, name = "employee_no", unique = true)
    private String employeeNo;
    private String phone;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(name = "join_date")
    private LocalDateTime joinDate;

    /**
     * for relationships
     **/

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "occupation_id", nullable = false)
    private Occupation occupation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @ManyToMany(mappedBy = "users")
    private Set<Project> projects = new HashSet<>();

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
