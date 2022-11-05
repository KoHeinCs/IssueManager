package com.aswetaw.issuemanager.project.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.Project;
import com.aswetaw.issuemanager.project.repository.ProjectRepository;
import com.aswetaw.issuemanager.request.dto.ProjectDTO;
import com.aswetaw.issuemanager.request.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class ProjectService extends BaseService<ProjectDTO, Project, Long> {
    private ProjectRepository projectRepo;
    private ProjectMapper projectMapper;

    public ProjectService(ProjectRepository projectRepo, ProjectMapper projectMapper) {
        super(projectRepo, projectMapper);
    }


}
