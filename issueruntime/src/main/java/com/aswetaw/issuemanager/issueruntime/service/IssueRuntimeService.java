package com.aswetaw.issuemanager.issueruntime.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.IssueRuntime;
import com.aswetaw.issuemanager.issueruntime.repository.IssueRuntimeRepository;
import com.aswetaw.issuemanager.request.dto.IssueRuntimeDTO;
import com.aswetaw.issuemanager.request.mapper.IssueRuntimeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class IssueRuntimeService extends BaseService<IssueRuntimeDTO, Long> {
    private final IssueRuntimeRepository issueRuntimeRepo;
    private final IssueRuntimeMapper issueRuntimeMapper;

    public IssueRuntimeDTO findById(Long id) {
        Optional<IssueRuntime> IssueRuntimeOptional = issueRuntimeRepo.findById(id);
        if (IssueRuntimeOptional.isPresent())
            return issueRuntimeMapper.toDTO(IssueRuntimeOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<IssueRuntimeDTO> findAll() {
        List<IssueRuntime> issueRuntimeList = issueRuntimeRepo.findAll();
        if (issueRuntimeList.isEmpty())
            return Collections.emptyList();
        else
            return issueRuntimeMapper.toDTOList(issueRuntimeList);
    }

    public void deleteById(Long id) {
        issueRuntimeRepo.deleteById(id);
    }

    public void delete(IssueRuntimeDTO issueRuntimeDTO) {
        issueRuntimeRepo.delete(issueRuntimeMapper.toEntity(issueRuntimeDTO));
    }

    public IssueRuntimeDTO save(IssueRuntimeDTO issueRuntimeDTO) {
        IssueRuntime issueRuntime = issueRuntimeRepo.saveAndFlush(issueRuntimeMapper.toEntity(issueRuntimeDTO));
        return issueRuntimeMapper.toDTO(issueRuntime);
    }

    public IssueRuntimeDTO update(Long id, IssueRuntimeDTO issueRuntimeDTO) {
        Optional<IssueRuntime> issueRuntimeOptional = issueRuntimeRepo.findById(id);
        if (issueRuntimeOptional.isPresent()) {
            IssueRuntime issueRuntime = issueRuntimeOptional.get();
            BeanUtils.copyProperties(issueRuntimeDTO, issueRuntime, "id");
            issueRuntimeRepo.save(issueRuntime);
        }
        // TODO throw id not found exception for modification
        return null;
    }

}
