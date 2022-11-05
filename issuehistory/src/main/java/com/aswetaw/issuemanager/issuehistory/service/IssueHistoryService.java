package com.aswetaw.issuemanager.issuehistory.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.IssueHistory;
import com.aswetaw.issuemanager.issuehistory.repository.IssueHistoryRepository;
import com.aswetaw.issuemanager.request.dto.IssueHistoryDTO;
import com.aswetaw.issuemanager.request.mapper.IssueHistoryMapper;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
public class IssueHistoryService extends BaseService<IssueHistoryDTO, IssueHistory, Long> {

    private IssueHistoryRepository issueHistoryRepo;
    private IssueHistoryMapper issueHistoryMapper;

    public IssueHistoryService(IssueHistoryRepository issueHistoryRepo, IssueHistoryMapper issueHistoryMapper) {
        super(issueHistoryRepo, issueHistoryMapper);
    }

}
