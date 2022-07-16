package com.aswetaw.issuemanager.project.repository;

import com.aswetaw.issuemanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
