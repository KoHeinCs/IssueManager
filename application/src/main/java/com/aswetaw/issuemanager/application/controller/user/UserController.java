package com.aswetaw.issuemanager.application.controller.user;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.request.dto.UserDTO;
import com.aswetaw.issuemanager.user.service.UserService;
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
@RequestMapping(user)
public class UserController {
    private final UserService userService;

    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody UserDTO userDTO) {
        return ResponseHandler.createHttpResponse(userService.save(userDTO), "New user was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@RequestBody UserDTO userDTO) {
        return ResponseHandler.createHttpResponse(userService.update(userDTO.getId(), userDTO), "User was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAllUser() {
        List<UserDTO> userDTOList = userService.findAll();
        return ResponseHandler.createHttpResponse(userDTOList, "Requested users were given ", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getUserById(@PathVariable("id") Long id) {
        return ResponseHandler.createHttpResponse(userService.findById(id), "Requested user were given ", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> deleteUser(@PathVariable("id") long id) {
        userService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested user which has id =" + id + " was deleted ", HttpStatus.OK);
    }
}
