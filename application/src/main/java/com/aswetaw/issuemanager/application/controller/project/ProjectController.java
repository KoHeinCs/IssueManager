package com.aswetaw.issuemanager.application.controller.project;

import com.aswetaw.issuemanager.common.BaseController;
import com.aswetaw.issuemanager.project.service.ProjectService;
import com.aswetaw.issuemanager.request.dto.ProjectDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.util.ApiConstant.project;

/**
 * @author Hein Htet Aung
 * @created at 04/11/2022
 **/
@RestController
@RequestMapping(project)
public class ProjectController extends BaseController<ProjectDTO, Long> {

    public ProjectController(ProjectService projectService) {
        super(projectService);
    }

}
