package com.aswetaw.issuemanager.project.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.Project;
import com.aswetaw.issuemanager.project.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class ProjectService implements BaseService<Project, Long> {
    private final ProjectRepository projectRepo;

    @Override
    public Project findById(Long id) {
        return projectRepo.findById(id).get();
    }

    @Override
    public List<Project> findAll() {
        return projectRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        projectRepo.deleteById(id);
    }

    @Override
    public void delete(Project branch) {
        projectRepo.delete(branch);
    }

    @Override
    public Project save(Project branch) {
        return projectRepo.saveAndFlush(branch);
    }
}
