package com.aswetaw.issuemanager.department.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.department.repository.DepartmentRepository;
import com.aswetaw.issuemanager.entities.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class DepartmentService implements BaseService<Department, Long> {
    private final DepartmentRepository departmentRepo;

    @Override
    public Department findById(Long id) {
        return departmentRepo.findById(id).get();
    }

    @Override
    public List<Department> findAll() {
        return departmentRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        departmentRepo.deleteById(id);
    }

    @Override
    public void delete(Department branch) {
        departmentRepo.delete(branch);
    }

    @Override
    public Department save(Department branch) {
        return departmentRepo.saveAndFlush(branch);
    }
}
