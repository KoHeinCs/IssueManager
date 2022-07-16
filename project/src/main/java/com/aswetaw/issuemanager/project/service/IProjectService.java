package com.aswetaw.issuemanager.project.service;

import com.aswetaw.issuemanager.model.Project;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
public interface IProjectService {
    void create(Project project);
    void update(Project project);
    void delete(Project project);
}
