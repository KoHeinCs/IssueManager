package com.aswetaw.issuemanager.issuepriority.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.IssuePriority;
import com.aswetaw.issuemanager.issuepriority.repository.IssuePriorityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssuePriorityService implements BaseService<IssuePriority, Long> {
    private final IssuePriorityRepository issuePriorityRepo;

    @Override
    public IssuePriority findById(Long id) {
        return issuePriorityRepo.findById(id).get();
    }

    @Override
    public List<IssuePriority> findAll() {
        return issuePriorityRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        issuePriorityRepo.deleteById(id);
    }

    @Override
    public void delete(IssuePriority branch) {
        issuePriorityRepo.delete(branch);
    }

    @Override
    public IssuePriority save(IssuePriority branch) {
        return issuePriorityRepo.saveAndFlush(branch);
    }
}
