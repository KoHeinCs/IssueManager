package com.aswetaw.issuemanager.role.service;
import com.aswetaw.issuemanager.model.Role;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
public interface IRoleService {
    void create(Role role);
    void update(Role role);
    void delete(Role role);
}
