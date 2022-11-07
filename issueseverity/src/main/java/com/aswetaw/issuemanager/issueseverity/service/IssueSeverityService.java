package com.aswetaw.issuemanager.issueseverity.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.IssueSeverity;
import com.aswetaw.issuemanager.issueseverity.repository.IssueSeverityRepository;
import com.aswetaw.issuemanager.request.dto.IssueSeverityDTO;
import com.aswetaw.issuemanager.request.mapper.IssueSeverityMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class IssueSeverityService extends BaseService<IssueSeverityDTO, IssueSeverity, Long> {


    public IssueSeverityService(
            IssueSeverityRepository issueSeverityRepo,
            IssueSeverityMapper issueSeverityMapper
    ) {
        super(issueSeverityRepo, issueSeverityMapper);
    }

    public void init(){
        if (jpaRepo.count()==0){
            IssueSeverity issueSeverity1 = new IssueSeverity("Critical","This defect indicates complete shut-down of the process, nothing can proceed further");
            IssueSeverity issueSeverity2 = new IssueSeverity("Major","It is a highly severe defect and collapses the system. However, certain parts of the system remain functional");
            IssueSeverity issueSeverity3 = new IssueSeverity("Medium","It causes some undesirable behavior, but the system is still functional");
            IssueSeverity issueSeverity4 = new IssueSeverity("Low","It won’t cause any major break-down of the system");
            jpaRepo.saveAll(Arrays.asList(issueSeverity1,issueSeverity2,issueSeverity3,issueSeverity4));
        }
    }


}
