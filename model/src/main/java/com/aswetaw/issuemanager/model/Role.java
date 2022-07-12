package com.aswetaw.issuemanager.model;

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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,unique = true)
    private RoleType role;

    /** for relationships **/

    @Version
    private int version;
}
