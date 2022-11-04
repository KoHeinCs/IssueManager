package com.aswetaw.issuemanager.application.controller.issueruntime;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.issueruntime.service.IssueRuntimeService;
import com.aswetaw.issuemanager.request.dto.IssueRuntimeDTO;
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
@RequestMapping(issueruntime)
public class IssueRuntimeController {
    private final IssueRuntimeService issueRuntimeService;

    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody IssueRuntimeDTO issueRuntimeDTO) {
        return ResponseHandler.createHttpResponse(issueRuntimeService.save(issueRuntimeDTO), "New issue runtime was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@RequestBody IssueRuntimeDTO issueRuntimeDTO) {
        return ResponseHandler.createHttpResponse(issueRuntimeService.update(issueRuntimeDTO.getId(), issueRuntimeDTO), "IssueRuntime was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAllIssueRuntime() {
        List<IssueRuntimeDTO> issueRuntimeDTOList = issueRuntimeService.findAll();
        return ResponseHandler.createHttpResponse(issueRuntimeDTOList, "Requested issue runtimes were given ", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getIssueRuntimeById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(issueRuntimeService.findById(id), "Requested issue runtime were given ", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> deleteIssueRuntime(@PathVariable("id") long id) {
        issueRuntimeService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested issue runtime which has id =" + id + " was deleted ", HttpStatus.OK);
    }
}
