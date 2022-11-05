package com.aswetaw.issuemanager.issueseverity.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.IssueSeverity;
import com.aswetaw.issuemanager.issueseverity.repository.IssueSeverityRepository;
import com.aswetaw.issuemanager.request.dto.IssueSeverityDTO;
import com.aswetaw.issuemanager.request.mapper.IssueSeverityMapper;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class IssueSeverityService extends BaseService<IssueSeverityDTO, IssueSeverity, Long> {

    private IssueSeverityRepository issueSeverityRepo;
    private IssueSeverityMapper issueSeverityMapper;

    public IssueSeverityService(
            IssueSeverityRepository issueSeverityRepo,
            IssueSeverityMapper issueSeverityMapper
    ) {
        super(issueSeverityRepo, issueSeverityMapper);
    }


}
