package com.aswetaw.issuemanager.role.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.Role;
import com.aswetaw.issuemanager.role.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class RoleService implements BaseService<Role, Long> {
    private final RoleRepository roleRepo;

    @Override
    public Role findById(Long id) {
        return roleRepo.findById(id).get();
    }

    @Override
    public List<Role> findAll() {
        return roleRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        roleRepo.deleteById(id);
    }

    @Override
    public void delete(Role branch) {
        roleRepo.delete(branch);
    }

    @Override
    public Role save(Role branch) {
        return roleRepo.saveAndFlush(branch);
    }
}
