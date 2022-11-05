package com.aswetaw.issuemanager.application.controller.branch;

import com.aswetaw.issuemanager.branch.service.BranchService;
import com.aswetaw.issuemanager.common.BaseController;
import com.aswetaw.issuemanager.request.dto.BranchDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.util.ApiConstant.branch;

/**
 * @author Hein Htet Aung
 * @created at 31/10/2022
 **/
@RestController
@RequestMapping(branch)
public class BranchController extends BaseController<BranchDTO, Long> {

    public BranchController(BranchService branchService) {
        super(branchService);
    }


}
