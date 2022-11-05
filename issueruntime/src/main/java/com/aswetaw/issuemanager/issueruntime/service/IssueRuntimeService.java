package com.aswetaw.issuemanager.issueruntime.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.IssueRuntime;
import com.aswetaw.issuemanager.issueruntime.repository.IssueRuntimeRepository;
import com.aswetaw.issuemanager.request.dto.IssueRuntimeDTO;
import com.aswetaw.issuemanager.request.mapper.IssueRuntimeMapper;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class IssueRuntimeService extends BaseService<IssueRuntimeDTO, IssueRuntime, Long> {
    private IssueRuntimeRepository issueRuntimeRepo;
    private IssueRuntimeMapper issueRuntimeMapper;

    public IssueRuntimeService(IssueRuntimeRepository issueRuntimeRepo, IssueRuntimeMapper issueRuntimeMapper) {
        super(issueRuntimeRepo, issueRuntimeMapper);
    }


}
