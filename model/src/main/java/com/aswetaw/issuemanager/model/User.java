package com.aswetaw.issuemanager.model;

import com.aswetaw.issuemanager.config.Audit;
import com.aswetaw.issuemanager.config.AuditListener;
import com.aswetaw.issuemanager.config.IAudit;
import com.aswetaw.issuemanager.enums.Position;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

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
    @Column(nullable = false,updatable = false)
    private Long id;

    @Column(nullable = false,name = "user_name")
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false,name = "employee_no",unique = true)
    private String employeeNo;
    @Enumerated(EnumType.STRING)
    private Position position;
    private String phone;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(name = "join_date")
    private LocalDateTime joinDate;
    @Column(name = "profile_path")
    private String profilePath;

    /** for relationships **/

    /** for audit log **/
    @Embedded
    Audit audit;

    /** for transaction concurrency control **/
    @Version
    private int version;

}
