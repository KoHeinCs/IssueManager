package com.aswetaw.issuemanager.application.controller;

import com.aswetaw.issuemanager.model.User;
import com.aswetaw.issuemanager.user.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService iUserService;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return iUserService.getAllUsers();
    }
}
