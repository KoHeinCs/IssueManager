package com.aswetaw.issuemanager.application.controller.issueseverity;

import com.aswetaw.issuemanager.common.BaseController;
import com.aswetaw.issuemanager.issueseverity.service.IssueSeverityService;
import com.aswetaw.issuemanager.request.dto.IssueSeverityDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.util.ApiConstant.issueseverity;

/**
 * @author Hein Htet Aung
 * @created at 04/11/2022
 **/
@RestController
@RequestMapping(issueseverity)
public class IssueSeverityController extends BaseController<IssueSeverityDTO, Long> {
    public IssueSeverityController(IssueSeverityService issueSeverityService) {
        super(issueSeverityService);
    }


}
