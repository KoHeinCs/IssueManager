package com.aswetaw.issuemanager.issueruntime.repository;

import com.aswetaw.issuemanager.model.IssueRuntime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Repository
public interface IssueRuntimeRepository extends JpaRepository<IssueRuntime,Long> {
}
