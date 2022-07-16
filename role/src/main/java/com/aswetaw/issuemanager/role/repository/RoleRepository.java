package com.aswetaw.issuemanager.role.repository;

import com.aswetaw.issuemanager.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
