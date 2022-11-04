package com.aswetaw.issuemanager.application.controller.issuepriority;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.issuepriority.service.IssuePriorityService;
import com.aswetaw.issuemanager.request.dto.IssuePriorityDTO;
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
@RequestMapping(issuepriority)
public class IssuePriorityController {
    private final IssuePriorityService issuePriorityService;

    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody IssuePriorityDTO issuePriorityDTO) {
        return ResponseHandler.createHttpResponse(issuePriorityService.save(issuePriorityDTO), "New issue priority was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@RequestBody IssuePriorityDTO issuePriorityDTO) {
        return ResponseHandler.createHttpResponse(issuePriorityService.update(issuePriorityDTO.getId(), issuePriorityDTO), "IssuePriority was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAllIssuePriority() {
        List<IssuePriorityDTO> issuePriorityDTOList = issuePriorityService.findAll();
        return ResponseHandler.createHttpResponse(issuePriorityDTOList, "Requested issue priority s were given ", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getIssuePriorityById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(issuePriorityService.findById(id), "Requested issue priority was given ", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> deleteIssuePriority(@PathVariable("id") long id) {
        issuePriorityService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested issuePriority which has id =" + id + " was deleted ", HttpStatus.OK);
    }
}
