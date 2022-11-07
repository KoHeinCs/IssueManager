package com.aswetaw.issuemanager.role.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.Role;
import com.aswetaw.issuemanager.request.dto.RoleDTO;
import com.aswetaw.issuemanager.request.mapper.RoleMapper;
import com.aswetaw.issuemanager.role.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class RoleService extends BaseService<RoleDTO, Role, Long> {

    public RoleService(
            RoleRepository roleRepo,
            RoleMapper roleMapper
    ) {
        super(roleRepo, roleMapper);
    }

    public void init() {
        if (jpaRepo.count() == 0) {
            Role role1 = new Role("developer", "Every developer can create and solve  issues");
            Role role2 = new Role("leader", "Every leader can create and solve  issues  ");
            Role role3 = new Role("tester", "Every tester can only create issues and closed solved issue");
            Role role4 = new Role("manager", "Every manager can only define and maintain projects and people");
            Role role5 = new Role("customer", "Every customer can only create issues");
            jpaRepo.saveAll(Arrays.asList(role1, role2, role3, role4, role5));
        }
    }
}
