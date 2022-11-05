package com.aswetaw.issuemanager.application.controller.issueruntime;

import com.aswetaw.issuemanager.common.BaseController;
import com.aswetaw.issuemanager.issueruntime.service.IssueRuntimeService;
import com.aswetaw.issuemanager.request.dto.IssueRuntimeDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.util.ApiConstant.issueruntime;

/**
 * @author Hein Htet Aung
 * @created at 04/11/2022
 **/
@RestController
@RequestMapping(issueruntime)
public class IssueRuntimeController extends BaseController<IssueRuntimeDTO, Long> {
    public IssueRuntimeController(IssueRuntimeService issueRuntimeService) {
        super(issueRuntimeService);
    }


}
