package com.aswetaw.issuemanager.department.repository;

import com.aswetaw.issuemanager.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Optional<Department> findByName(String name);
}
