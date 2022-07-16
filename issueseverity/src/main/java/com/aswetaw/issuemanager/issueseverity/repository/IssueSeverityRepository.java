package com.aswetaw.issuemanager.issueseverity.repository;

import com.aswetaw.issuemanager.model.IssueSeverity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Repository
public interface IssueSeverityRepository extends JpaRepository<IssueSeverity,Long> {
}
