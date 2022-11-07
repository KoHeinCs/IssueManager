package com.aswetaw.issuemanager.issuepriority.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.IssuePriority;
import com.aswetaw.issuemanager.issuepriority.repository.IssuePriorityRepository;
import com.aswetaw.issuemanager.request.dto.IssuePriorityDTO;
import com.aswetaw.issuemanager.request.mapper.IssuePriorityMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class IssuePriorityService extends BaseService<IssuePriorityDTO, IssuePriority, Long> {

    public IssuePriorityService(IssuePriorityRepository issuePriorityRepo, IssuePriorityMapper issuePriorityMapper) {
        super(issuePriorityRepo, issuePriorityMapper);
    }

    public void init() {
        if (jpaRepo.count() == 0) {
            IssuePriority branch1 = new IssuePriority("Low", "The Defect is an irritant but repair can be done once the more serious Defect has been fixed");
            IssuePriority branch2 = new IssuePriority("Medium", "During the normal course of the development activities defect should be resolved. It can wait until a new version is created");
            IssuePriority branch3 = new IssuePriority("High", "The defect must be resolved as soon as possible as it affects the system severely and cannot be used until it is fixed");
            jpaRepo.saveAll(Arrays.asList(branch1, branch2, branch3));
        }
    }


}
