package com.aswetaw.issuemanager.issuehistory.repository;

import com.aswetaw.issuemanager.model.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Repository
public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}
