package com.aswetaw.issuemanager.application.controller.project;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.project.service.ProjectService;
import com.aswetaw.issuemanager.request.dto.ProjectDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.aswetaw.issuemanager.common.util.ApiConstant.*;

/**
 * @author Hein Htet Aung
 * @created at 04/11/2022
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(project)
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody ProjectDTO projectDTO) {
        return ResponseHandler.createHttpResponse(projectService.save(projectDTO), "New project was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@RequestBody ProjectDTO projectDTO) {
        return ResponseHandler.createHttpResponse(projectService.update(projectDTO.getId(), projectDTO), "Project was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAllProject() {
        List<ProjectDTO> projectDTOList = projectService.findAll();
        return ResponseHandler.createHttpResponse(projectDTOList, "Requested projects were given ", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getProjectById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(projectService.findById(id), "Requested project were given ", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> deleteProject(@PathVariable("id") long id) {
        projectService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested project which has id =" + id + " was deleted ", HttpStatus.OK);
    }
}
