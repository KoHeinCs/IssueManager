package com.aswetaw.issuemanager.application.controller.issueseverity;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.issueseverity.service.IssueSeverityService;
import com.aswetaw.issuemanager.request.dto.IssueSeverityDTO;
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
@RequestMapping(issueseverity)
public class IssueSeverityController {
    private final IssueSeverityService issueSeverityService;

    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody IssueSeverityDTO issueSeverityDTO) {
        return ResponseHandler.createHttpResponse(issueSeverityService.save(issueSeverityDTO), "New issue severity was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@RequestBody IssueSeverityDTO issueSeverityDTO) {
        return ResponseHandler.createHttpResponse(issueSeverityService.update(issueSeverityDTO.getId(), issueSeverityDTO), "IssueSeverity was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAllIssueSeverity() {
        List<IssueSeverityDTO> issueSeverityDTOList = issueSeverityService.findAll();
        return ResponseHandler.createHttpResponse(issueSeverityDTOList, "Requested issue severities were given ", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getIssueSeverityById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(issueSeverityService.findById(id), "Requested issue severity were given ", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> deleteIssueSeverity(@PathVariable("id") long id) {
        issueSeverityService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested issue severity which has id =" + id + " was deleted ", HttpStatus.OK);
    }
}
