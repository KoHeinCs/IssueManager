package com.aswetaw.issuemanager.application.controller.role;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.request.dto.RoleDTO;
import com.aswetaw.issuemanager.role.service.RoleService;
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
@RequestMapping(role)
public class RoleController {
    private final RoleService roleService;

    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody RoleDTO roleDTO) {
        return ResponseHandler.createHttpResponse(roleService.save(roleDTO), "New role was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@RequestBody RoleDTO roleDTO) {
        return ResponseHandler.createHttpResponse(roleService.update(roleDTO.getId(), roleDTO), "Role was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAllRole() {
        List<RoleDTO> roleDTOList = roleService.findAll();
        return ResponseHandler.createHttpResponse(roleDTOList, "Requested roles were given ", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getRoleById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(roleService.findById(id), "Requested role were given ", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> deleteRole(@PathVariable("id") long id) {
        roleService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested role which has id =" + id + " was deleted ", HttpStatus.OK);
    }
}
