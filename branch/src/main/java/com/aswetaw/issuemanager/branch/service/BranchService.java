package com.aswetaw.issuemanager.branch.service;

import com.aswetaw.issuemanager.branch.repository.BranchRepository;
import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.Branch;
import com.aswetaw.issuemanager.request.dto.BranchDTO;
import com.aswetaw.issuemanager.request.mapper.BranchMapper;
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
public class BranchService extends BaseService<BranchDTO, Long> {

    private final BranchRepository branchRepo;
    private final BranchMapper branchMapper;

    public BranchDTO findById(Long id) {
        Optional<Branch> branchOptional = branchRepo.findById(id);
        if (branchOptional.isPresent())
            return branchMapper.toDTO(branchOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<BranchDTO> findAll() {
        List<Branch> branchList = branchRepo.findAll();
        if (branchList.isEmpty())
            return Collections.emptyList();
        else
            return branchMapper.toDTOList(branchList);
    }

    public void deleteById(Long id) {
        branchRepo.deleteById(id);
    }

    public void delete(BranchDTO branchDTO) {
        branchRepo.delete(branchMapper.toEntity(branchDTO));
    }

    public BranchDTO save(BranchDTO branchDTO) {
        Branch branch = branchRepo.saveAndFlush(branchMapper.toEntity(branchDTO));
        return branchMapper.toDTO(branch);
    }

    public BranchDTO update(Long id, BranchDTO branchDTO) {
        Optional<Branch> branchOptional = branchRepo.findById(id);
        if (branchOptional.isPresent()) {
            Branch branch = branchMapper.toEntity(branchDTO);
            branchRepo.save(branch);
        }
        // TODO throw id not found exception for modification
        return null;
    }

}
