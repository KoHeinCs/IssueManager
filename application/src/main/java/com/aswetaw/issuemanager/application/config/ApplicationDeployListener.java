package com.aswetaw.issuemanager.application.config;

import com.aswetaw.issuemanager.branch.service.BranchService;
import com.aswetaw.issuemanager.department.service.DepartmentService;
import com.aswetaw.issuemanager.exception.IssueManagerException;
import com.aswetaw.issuemanager.issuepriority.service.IssuePriorityService;
import com.aswetaw.issuemanager.issueseverity.service.IssueSeverityService;
import com.aswetaw.issuemanager.occupation.service.OccupationService;
import com.aswetaw.issuemanager.role.service.RoleService;
import com.aswetaw.issuemanager.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Hein Htet Aung
 * @created at 27/06/2022
 **/
@Component
@RequiredArgsConstructor
public class ApplicationDeployListener implements ApplicationListener<ApplicationReadyEvent> {
    private final BranchService branchService;
    private final OccupationService occupationService;
    private final DepartmentService departmentService;
    private final IssueSeverityService issueSeverityService;
    private final IssuePriorityService issuePriorityService;
    private final RoleService roleService;
    private final UserService userService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        branchService.init();
        occupationService.init();
        departmentService.init();
        issueSeverityService.init();
        issuePriorityService.init();
        roleService.init();
        userService.init();
    }
}
