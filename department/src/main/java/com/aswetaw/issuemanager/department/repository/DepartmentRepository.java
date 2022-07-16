package com.aswetaw.issuemanager.department.repository;

import com.aswetaw.issuemanager.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
