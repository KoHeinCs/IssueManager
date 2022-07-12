package com.aswetaw.issuemanager.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

/**
 * @author Hein Htet Aung
 * @created at 12/07/2022
 **/
@Embeddable
@Getter
@Setter
public class Audit {

    @Column(name = "createdBy", updatable = false)
    private String createdBy;
    @Column(name = "createdDate", updatable = false)
    private Instant createdDate;
    @Column(name = "updatedBy")
    private String updatedBy;
    @Column(name = "updatedDate")
    private Instant updatedDate;

//    @PrePersist
//    private void onCreate(){
//        createdDate = Instant.now();
//    }
//
//    @PreUpdate
//    private void onUpdate(){
//        updatedDate = Instant.now();
//    }
}
