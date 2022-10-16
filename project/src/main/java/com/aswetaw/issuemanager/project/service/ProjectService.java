package com.aswetaw.issuemanager.project.service;

import com.aswetaw.issuemanager.entities.Project;
import com.aswetaw.issuemanager.project.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class ProjectService implements IProjectService{
    private final ProjectRepository projectRepo;

    @Override
    public void create(Project project) {
        projectRepo.save(project);
    }

    @Override
    public void update(Project project) {
        projectRepo.save(project);
    }

    @Override
    public void delete(Project project) {
        projectRepo.delete(project);
    }
}
