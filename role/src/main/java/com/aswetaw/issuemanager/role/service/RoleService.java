package com.aswetaw.issuemanager.role.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.Role;
import com.aswetaw.issuemanager.request.dto.RoleDTO;
import com.aswetaw.issuemanager.request.mapper.RoleMapper;
import com.aswetaw.issuemanager.role.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
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
public class RoleService extends BaseService<RoleDTO, Long> {
    private final RoleRepository roleRepo;
    private final RoleMapper roleMapper;

    public RoleDTO findById(Long id) {
        Optional<Role> roleOptional = roleRepo.findById(id);
        if (roleOptional.isPresent())
            return roleMapper.toDTO(roleOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<RoleDTO> findAll() {
        List<Role> roleList = roleRepo.findAll();
        if (roleList.isEmpty())
            return Collections.emptyList();
        else
            return roleMapper.toDTOList(roleList);
    }

    public void deleteById(Long id) {
        roleRepo.deleteById(id);
    }

    public void delete(RoleDTO roleDTO) {
        roleRepo.delete(roleMapper.toEntity(roleDTO));
    }

    public RoleDTO save(RoleDTO roleDTO) {
        Role role = roleRepo.saveAndFlush(roleMapper.toEntity(roleDTO));
        return roleMapper.toDTO(role);
    }

    public RoleDTO update(Long id, RoleDTO roleDTO) {
        Optional<Role> roleOptional = roleRepo.findById(id);
        if (roleOptional.isPresent()) {
            Role role = roleMapper.toEntity(roleDTO);
            roleRepo.save(role);
        }
        // TODO throw id not found exception for modification
        return null;
    }

}
