package com.aswetaw.issuemanager.department.service;

import com.aswetaw.issuemanager.department.repository.DepartmentRepository;
import com.aswetaw.issuemanager.entities.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class DepartmentService implements IDepartmentService{
    private final DepartmentRepository departmentRepo;

    @Override
    public void create(Department department) {
        departmentRepo.save(department);
    }

    @Override
    public void update(Department department) {
        departmentRepo.save(department);
    }

    @Override
    public void delete(Department department) {
        departmentRepo.save(department);
    }
}
