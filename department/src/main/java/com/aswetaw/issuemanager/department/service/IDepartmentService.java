package com.aswetaw.issuemanager.department.service;
import com.aswetaw.issuemanager.entities.Department;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
public interface IDepartmentService {
    void create(Department department);
    void update(Department department);
    void delete(Department department);
}
