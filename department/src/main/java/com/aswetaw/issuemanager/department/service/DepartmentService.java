package com.aswetaw.issuemanager.department.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.department.repository.DepartmentRepository;
import com.aswetaw.issuemanager.entities.Department;
import com.aswetaw.issuemanager.request.dto.DepartmentDTO;
import com.aswetaw.issuemanager.request.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
public class DepartmentService extends BaseService<DepartmentDTO, Department, Long> {
    private DepartmentRepository departmentRepo;
    private DepartmentMapper departmentMapper;

    public DepartmentService(DepartmentRepository departmentRepo, DepartmentMapper departmentMapper) {
        super(departmentRepo, departmentMapper);
    }


}
