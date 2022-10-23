package com.aswetaw.issuemanager.issuehistory.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.IssueHistory;
import com.aswetaw.issuemanager.issuehistory.repository.IssueHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueHistoryService implements BaseService<IssueHistory, Long> {
    private final IssueHistoryRepository issueHistoryRepo;

    @Override
    public IssueHistory findById(Long id) {
        return issueHistoryRepo.findById(id).get();
    }

    @Override
    public List<IssueHistory> findAll() {
        return issueHistoryRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        issueHistoryRepo.deleteById(id);
    }

    @Override
    public void delete(IssueHistory branch) {
        issueHistoryRepo.delete(branch);
    }

    @Override
    public IssueHistory save(IssueHistory branch) {
        return issueHistoryRepo.saveAndFlush(branch);
    }
}
