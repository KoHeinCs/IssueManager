package com.aswetaw.issuemanager.application.controller.department;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.department.service.DepartmentService;
import com.aswetaw.issuemanager.request.dto.DepartmentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.aswetaw.issuemanager.common.util.ApiConstant.*;

/**
 * @author Hein Htet Aung
 * @created at 03/11/2022
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(department)
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody DepartmentDTO departmentDTO) {
        return ResponseHandler.createHttpResponse(departmentService.save(departmentDTO), "New department was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@RequestBody DepartmentDTO departmentDTO) {
        return ResponseHandler.createHttpResponse(departmentService.update(departmentDTO.getId(), departmentDTO), "Department was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAllDepartment() {
        List<DepartmentDTO> departmentDTOList = departmentService.findAll();
        return ResponseHandler.createHttpResponse(departmentDTOList, "Requested departments were given ", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getDepartmentById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(departmentService.findById(id), "Requested department were given ", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> deleteDepartment(@PathVariable("id") long id) {
        departmentService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested department which has id =" + id + " was deleted ", HttpStatus.OK);
    }
}
