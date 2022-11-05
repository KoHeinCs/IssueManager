package com.aswetaw.issuemanager.role.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.Role;
import com.aswetaw.issuemanager.request.dto.RoleDTO;
import com.aswetaw.issuemanager.request.mapper.RoleMapper;
import com.aswetaw.issuemanager.role.repository.RoleRepository;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class RoleService extends BaseService<RoleDTO, Role, Long> {
    private RoleRepository roleRepo;
    private RoleMapper roleMapper;

    public RoleService(
            RoleRepository roleRepo,
            RoleMapper roleMapper
    ) {
        super(roleRepo, roleMapper);
    }
}
