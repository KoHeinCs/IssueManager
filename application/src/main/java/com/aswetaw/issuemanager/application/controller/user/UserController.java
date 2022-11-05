package com.aswetaw.issuemanager.application.controller.user;

import com.aswetaw.issuemanager.commongeneric.BaseController;
import com.aswetaw.issuemanager.request.dto.UserDTO;
import com.aswetaw.issuemanager.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.constant.ApiConstant.user;

/**
 * @author Hein Htet Aung
 * @created at 04/11/2022
 **/
@RestController
@RequestMapping(user)
public class UserController extends BaseController<UserDTO, Long> {
    public UserController(UserService userService) {
        super(userService);
    }

}
