package com.aswetaw.issuemanager.issueseverity.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.IssueSeverity;
import com.aswetaw.issuemanager.issueseverity.repository.IssueSeverityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueSeverityService implements BaseService<IssueSeverity, Long> {
    private final IssueSeverityRepository issueSeverityRepo;

    @Override
    public IssueSeverity findById(Long id) {
        return issueSeverityRepo.findById(id).get();
    }

    @Override
    public List<IssueSeverity> findAll() {
        return issueSeverityRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        issueSeverityRepo.deleteById(id);
    }

    @Override
    public void delete(IssueSeverity branch) {
        issueSeverityRepo.delete(branch);
    }

    @Override
    public IssueSeverity save(IssueSeverity branch) {
        return issueSeverityRepo.saveAndFlush(branch);
    }
}
