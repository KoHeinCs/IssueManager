package com.aswetaw.issuemanager.issuepriority.repository;

import com.aswetaw.issuemanager.model.IssuePriority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Repository
public interface IssuePriorityRepository extends JpaRepository<IssuePriority,Long> {
}
