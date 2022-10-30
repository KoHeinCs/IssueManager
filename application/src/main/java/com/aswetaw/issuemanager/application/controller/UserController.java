package com.aswetaw.issuemanager.application.controller;

import com.aswetaw.issuemanager.entities.User;
import com.aswetaw.issuemanager.response.HttpResponseDTO;
import com.aswetaw.issuemanager.response.ResponseHandler;
import com.aswetaw.issuemanager.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/find")
    public ResponseEntity<Object> getUser() {
        User user = new User();
        user.setUserName("Ko HeinCs");
        user.setPhone("098765432");
        return ResponseHandler.createHttpResponse(user,"Requested user was given",HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<Object> getAllUsers() {
        User user = new User();
        user.setUserName("Ko HeinCs");
        user.setPhone("098765432");
        List<User> users = Arrays.asList(user, user, user);
        return ResponseHandler.createHttpResponse(users,"Requested user list were given",HttpStatus.OK);
    }


}
