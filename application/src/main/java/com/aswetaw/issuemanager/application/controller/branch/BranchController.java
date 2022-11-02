package com.aswetaw.issuemanager.application.controller.branch;

import com.aswetaw.issuemanager.branch.service.BranchService;
import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.request.dto.BranchDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.aswetaw.issuemanager.common.util.ApiConstant.branch;

/**
 * @author Hein Htet Aung
 * @created at 31/10/2022
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(branch)
public class BranchController {

    private final BranchService branchService;

    @PostMapping("/create")
    private ResponseEntity<Object> create(@RequestBody BranchDTO branchDTO) {
        return ResponseHandler.createHttpResponse(branchService.save(branchDTO), "New branch was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping("/update")
    private ResponseEntity<Object> update(@RequestBody BranchDTO branchDTO) {
        return ResponseHandler.createHttpResponse(branchService.save(branchDTO), "Branch was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    private ResponseEntity<Object> getAllBranch() {
        List<BranchDTO> branchDTOList = branchService.findAll();
        if (branchDTOList.isEmpty())
            return ResponseHandler.createHttpResponse("There is no branch ", HttpStatus.NO_CONTENT);
        else
            return ResponseHandler.createHttpResponse(branchDTOList, "Requested branches were given ", HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getBranchById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(branchService.findById(id), "Requested branches were given ", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteBranch(@PathVariable("id") long id) {
        branchService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested branch id =" + id + " was deleted ", HttpStatus.NO_CONTENT);
    }


}
