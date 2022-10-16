package com.aswetaw.issuemanager.role.service;

import com.aswetaw.issuemanager.entities.Role;
import com.aswetaw.issuemanager.role.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class RoleService implements IRoleService{
    private final RoleRepository roleRepo;

    @Override
    public void create(Role role) {
        roleRepo.save(role);
    }

    @Override
    public void update(Role role) {
        roleRepo.save(role);
    }

    @Override
    public void delete(Role role) {
        roleRepo.delete(role);
    }
}
