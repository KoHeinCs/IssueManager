package com.aswetaw.issuemanager.application.controller.issuepriority;

import com.aswetaw.issuemanager.common.BaseController;
import com.aswetaw.issuemanager.issuepriority.service.IssuePriorityService;
import com.aswetaw.issuemanager.request.dto.IssuePriorityDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.util.ApiConstant.issuepriority;

/**
 * @author Hein Htet Aung
 * @created at 04/11/2022
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(issuepriority)
public class IssuePriorityController extends BaseController<IssuePriorityDTO, Long> {
    public IssuePriorityController(IssuePriorityService issuePriorityService) {
        super(issuePriorityService);
    }

}
