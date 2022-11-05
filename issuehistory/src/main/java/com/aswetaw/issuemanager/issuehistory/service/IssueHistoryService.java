package com.aswetaw.issuemanager.issuehistory.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.IssueHistory;
import com.aswetaw.issuemanager.issuehistory.repository.IssueHistoryRepository;
import com.aswetaw.issuemanager.request.dto.IssueHistoryDTO;
import com.aswetaw.issuemanager.request.mapper.IssueHistoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
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
        Optional<IssueHistory> issueHistoryOptional = issueHistoryRepo.findById(id);
        if (issueHistoryOptional.isPresent())
            return issueHistoryMapper.toDTO(issueHistoryOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<IssueHistoryDTO> findAll() {
        List<IssueHistory> issueHistoryList = issueHistoryRepo.findAll();
        if (issueHistoryList.isEmpty())
            return Collections.emptyList();
        else
            return issueHistoryMapper.toDTOList(issueHistoryList);
    }

    public void deleteById(Long id) {
        issueHistoryRepo.deleteById(id);
    }

    public void delete(IssueHistoryDTO issueHistoryDTO) {
        issueHistoryRepo.delete(issueHistoryMapper.toEntity(issueHistoryDTO));
    }

    public IssueHistoryDTO save(IssueHistoryDTO issueHistoryDTO) {
        IssueHistory issueHistory = issueHistoryRepo.saveAndFlush(issueHistoryMapper.toEntity(issueHistoryDTO));
        return issueHistoryMapper.toDTO(issueHistory);
    }

    public IssueHistoryDTO update(Long id, IssueHistoryDTO issueHistoryDTO) {
        Optional<IssueHistory> issueHistoryOptional = issueHistoryRepo.findById(id);
        if (issueHistoryOptional.isPresent()) {
            IssueHistory issueHistory = issueHistoryOptional.get();
            BeanUtils.copyProperties(issueHistoryDTO, issueHistory, "id");
            issueHistoryRepo.save(issueHistory);
        }
        // TODO throw id not found exception for modification
        return null;
    }
}
