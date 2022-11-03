package com.aswetaw.issuemanager.issuepriority.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.IssuePriority;
import com.aswetaw.issuemanager.issuepriority.repository.IssuePriorityRepository;
import com.aswetaw.issuemanager.request.dto.IssuePriorityDTO;
import com.aswetaw.issuemanager.request.mapper.IssuePriorityMapper;
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
public class IssuePriorityService extends BaseService<IssuePriorityDTO, Long> {
    private final IssuePriorityRepository issuePriorityRepo;
    private final IssuePriorityMapper issuePriorityMapper;

    public IssuePriorityDTO findById(Long id) {
        Optional<IssuePriority> issuePriorityOptional = issuePriorityRepo.findById(id);
        if (issuePriorityOptional.isPresent())
            return issuePriorityMapper.toDTO(issuePriorityOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<IssuePriorityDTO> findAll() {
        List<IssuePriority> issuePriorityList = issuePriorityRepo.findAll();
        if (issuePriorityList.isEmpty())
            return Collections.emptyList();
        else
            return issuePriorityMapper.toDTOList(issuePriorityList);
    }

    public void deleteById(Long id) {
        issuePriorityRepo.deleteById(id);
    }

    public void delete(IssuePriorityDTO issuePriorityDTO) {
        issuePriorityRepo.delete(issuePriorityMapper.toEntity(issuePriorityDTO));
    }

    public IssuePriorityDTO save(IssuePriorityDTO issuePriorityDTO) {
        IssuePriority issuePriority = issuePriorityRepo.saveAndFlush(issuePriorityMapper.toEntity(issuePriorityDTO));
        return issuePriorityMapper.toDTO(issuePriority);
    }

    public IssuePriorityDTO update(Long id, IssuePriorityDTO issuePriorityDTO) {
        Optional<IssuePriority> issuePriorityOptional = issuePriorityRepo.findById(id);
        if (issuePriorityOptional.isPresent()) {
            IssuePriority issuePriority = issuePriorityOptional.get();
            BeanUtils.copyProperties(issuePriorityDTO, issuePriority, "id");
            issuePriorityRepo.save(issuePriority);
        }
        // TODO throw id not found exception for modification
        return null;
    }


}
