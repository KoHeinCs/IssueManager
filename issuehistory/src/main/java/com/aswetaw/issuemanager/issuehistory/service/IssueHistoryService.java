package com.aswetaw.issuemanager.issuehistory.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.IssueHistory;
import com.aswetaw.issuemanager.issuehistory.repository.IssueHistoryRepository;
import com.aswetaw.issuemanager.request.dto.IssueHistoryDTO;
import com.aswetaw.issuemanager.request.mapper.IssueHistoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueHistoryService extends BaseService<IssueHistoryDTO, Long> {
    
    private final IssueHistoryRepository issueHistoryRepo;
    private final IssueHistoryMapper issueHistoryMapper;


    public IssueHistoryDTO findById(Long id) {
        Optional<IssueHistory> IssueHistoryOptional = issueHistoryRepo.findById(id);
        if (IssueHistoryOptional.isPresent())
            return issueHistoryMapper.toDTO(IssueHistoryOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<IssueHistoryDTO> findAll() {
        List<IssueHistory> IssueHistoryList = issueHistoryRepo.findAll();
        if (IssueHistoryList.isEmpty())
            return Collections.emptyList();
        else
            return issueHistoryMapper.toDTOList(IssueHistoryList);
    }

    public void deleteById(Long id) {
        issueHistoryRepo.deleteById(id);
    }

    public void delete(IssueHistoryDTO IssueHistoryDTO) {
        issueHistoryRepo.delete(issueHistoryMapper.toEntity(IssueHistoryDTO));
    }

    public IssueHistoryDTO save(IssueHistoryDTO IssueHistoryDTO) {
        IssueHistory IssueHistory = issueHistoryRepo.saveAndFlush(issueHistoryMapper.toEntity(IssueHistoryDTO));
        return issueHistoryMapper.toDTO(IssueHistory);
    }

    public IssueHistoryDTO update(Long id, IssueHistoryDTO IssueHistoryDTO) {
        Optional<IssueHistory> IssueHistoryOptional = issueHistoryRepo.findById(id);
        if (IssueHistoryOptional.isPresent()) {
            IssueHistory IssueHistory = issueHistoryMapper.toEntity(IssueHistoryDTO);
            issueHistoryRepo.save(IssueHistory);
        }
        // TODO throw id not found exception for modification
        return null;
    }
}
