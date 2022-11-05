package com.aswetaw.issuemanager.application.controller.role;

import com.aswetaw.issuemanager.commongeneric.BaseController;
import com.aswetaw.issuemanager.request.dto.RoleDTO;
import com.aswetaw.issuemanager.role.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.constant.ApiConstant.role;

/**
 * @author Hein Htet Aung
 * @created at 04/11/2022
 **/
@RestController
@RequestMapping(role)
public class RoleController extends BaseController<RoleDTO, Long> {
    public RoleController(RoleService roleService) {
        super(roleService);
    }

}
