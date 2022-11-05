package com.aswetaw.issuemanager.issueseverity.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.IssueSeverity;
import com.aswetaw.issuemanager.issueseverity.repository.IssueSeverityRepository;
import com.aswetaw.issuemanager.request.dto.IssueSeverityDTO;
import com.aswetaw.issuemanager.request.mapper.IssueSeverityMapper;
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
public class IssueSeverityService extends BaseService<IssueSeverityDTO, Long> {

    private final IssueSeverityRepository issueSeverityRepo;
    private final IssueSeverityMapper issueSeverityMapper;

    public IssueSeverityDTO findById(Long id) {
        Optional<IssueSeverity> issueSeverityOptional = issueSeverityRepo.findById(id);
        if (issueSeverityOptional.isPresent())
            return issueSeverityMapper.toDTO(issueSeverityOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<IssueSeverityDTO> findAll() {
        List<IssueSeverity> issueSeverityList = issueSeverityRepo.findAll();
        if (issueSeverityList.isEmpty())
            return Collections.emptyList();
        else
            return issueSeverityMapper.toDTOList(issueSeverityList);
    }

    public void deleteById(Long id) {
        issueSeverityRepo.deleteById(id);
    }

    public void delete(IssueSeverityDTO issueSeverityDTO) {
        issueSeverityRepo.delete(issueSeverityMapper.toEntity(issueSeverityDTO));
    }

    public IssueSeverityDTO save(IssueSeverityDTO issueSeverityDTO) {
        IssueSeverity issueSeverity = issueSeverityRepo.saveAndFlush(issueSeverityMapper.toEntity(issueSeverityDTO));
        return issueSeverityMapper.toDTO(issueSeverity);
    }

    public IssueSeverityDTO update(Long id, IssueSeverityDTO issueSeverityDTO) {
        Optional<IssueSeverity> issueSeverityOptional = issueSeverityRepo.findById(id);
        if (issueSeverityOptional.isPresent()) {
            IssueSeverity issueSeverity = issueSeverityOptional.get();
            BeanUtils.copyProperties(issueSeverityDTO, issueSeverity, "id");
            issueSeverityRepo.save(issueSeverity);
        }
        // TODO throw id not found exception for modification
        return null;
    }


}
