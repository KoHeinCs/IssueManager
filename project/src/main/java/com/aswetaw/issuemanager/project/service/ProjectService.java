package com.aswetaw.issuemanager.project.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.Project;
import com.aswetaw.issuemanager.project.repository.ProjectRepository;
import com.aswetaw.issuemanager.request.dto.ProjectDTO;
import com.aswetaw.issuemanager.request.mapper.ProjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class ProjectService extends BaseService<ProjectDTO, Long> {
    private final ProjectRepository projectRepo;
    private final ProjectMapper projectMapper;

    public ProjectDTO findById(Long id) {
        Optional<Project> projectOptional = projectRepo.findById(id);
        if (projectOptional.isPresent())
            return projectMapper.toDTO(projectOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<ProjectDTO> findAll() {
        List<Project> projectList = projectRepo.findAll();
        if (projectList.isEmpty())
            return Collections.emptyList();
        else
            return projectMapper.toDTOList(projectList);
    }

    public void deleteById(Long id) {
        projectRepo.deleteById(id);
    }

    public void delete(ProjectDTO projectDTO) {
        projectRepo.delete(projectMapper.toEntity(projectDTO));
    }

    public ProjectDTO save(ProjectDTO projectDTO) {
        Project project = projectRepo.saveAndFlush(projectMapper.toEntity(projectDTO));
        return projectMapper.toDTO(project);
    }

    public ProjectDTO update(Long id, ProjectDTO projectDTO) {
        Optional<Project> projectOptional = projectRepo.findById(id);
        if (projectOptional.isPresent()) {
            Project project = projectMapper.toEntity(projectDTO);
            projectRepo.save(project);
        }
        // TODO throw id not found exception for modification
        return null;
    }


}
