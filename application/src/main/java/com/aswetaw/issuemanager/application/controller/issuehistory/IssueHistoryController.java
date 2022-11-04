package com.aswetaw.issuemanager.application.controller.issuehistory;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.issuehistory.service.IssueHistoryService;
import com.aswetaw.issuemanager.request.dto.IssueHistoryDTO;
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
@RequestMapping(issuehistory)
public class IssueHistoryController {
    private final IssueHistoryService issueHistoryService;

    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody IssueHistoryDTO issueHistoryDTO) {
        return ResponseHandler.createHttpResponse(issueHistoryService.save(issueHistoryDTO), "New issue history was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@RequestBody IssueHistoryDTO issueHistoryDTO) {
        return ResponseHandler.createHttpResponse(issueHistoryService.update(issueHistoryDTO.getId(), issueHistoryDTO), "IssueHistory was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAllIssueHistory() {
        List<IssueHistoryDTO> issueHistoryDTOList = issueHistoryService.findAll();
        return ResponseHandler.createHttpResponse(issueHistoryDTOList, "Requested issue history were given ", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getIssueHistoryById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(issueHistoryService.findById(id), "Requested issue history were given ", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> deleteIssueHistory(@PathVariable("id") long id) {
        issueHistoryService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested issue history which has id =" + id + " was deleted ", HttpStatus.OK);
    }
}
