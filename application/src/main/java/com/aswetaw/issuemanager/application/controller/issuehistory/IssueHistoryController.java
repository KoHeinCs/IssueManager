package com.aswetaw.issuemanager.application.controller.issuehistory;

import com.aswetaw.issuemanager.common.BaseController;
import com.aswetaw.issuemanager.issuehistory.service.IssueHistoryService;
import com.aswetaw.issuemanager.request.dto.IssueHistoryDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.util.ApiConstant.issuehistory;

/**
 * @author Hein Htet Aung
 * @created at 04/11/2022
 **/
@RestController
@RequestMapping(issuehistory)
public class IssueHistoryController extends BaseController<IssueHistoryDTO, Long> {
    public IssueHistoryController(IssueHistoryService issueHistoryService) {
        super(issueHistoryService);
    }

}
