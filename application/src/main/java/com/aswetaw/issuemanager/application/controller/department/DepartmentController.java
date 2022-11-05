package com.aswetaw.issuemanager.application.controller.department;

import com.aswetaw.issuemanager.common.BaseController;
import com.aswetaw.issuemanager.department.service.DepartmentService;
import com.aswetaw.issuemanager.request.dto.DepartmentDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.util.ApiConstant.department;

/**
 * @author Hein Htet Aung
 * @created at 03/11/2022
 **/
@RestController
@RequestMapping(department)
public class DepartmentController extends BaseController<DepartmentDTO, Long> {
    public DepartmentController(DepartmentService departmentService) {
        super(departmentService);
    }

}
