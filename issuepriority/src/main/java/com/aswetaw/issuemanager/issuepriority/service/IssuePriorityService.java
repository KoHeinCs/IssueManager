package com.aswetaw.issuemanager.issuepriority.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.IssuePriority;
import com.aswetaw.issuemanager.issuepriority.repository.IssuePriorityRepository;
import com.aswetaw.issuemanager.request.dto.IssuePriorityDTO;
import com.aswetaw.issuemanager.request.mapper.IssuePriorityMapper;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class IssuePriorityService extends BaseService<IssuePriorityDTO, IssuePriority, Long> {
    private IssuePriorityRepository issuePriorityRepo;
    private IssuePriorityMapper issuePriorityMapper;

    public IssuePriorityService(IssuePriorityRepository issuePriorityRepo, IssuePriorityMapper issuePriorityMapper) {
        super(issuePriorityRepo, issuePriorityMapper);
    }


}
