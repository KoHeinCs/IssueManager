package com.aswetaw.issuemanager.issue.repository;

import com.aswetaw.issuemanager.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Repository
public interface IssueRepository extends JpaRepository<Issue,Long> {
}
