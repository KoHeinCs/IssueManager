package com.aswetaw.issuemanager.department.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.department.repository.DepartmentRepository;
import com.aswetaw.issuemanager.entities.Department;
import com.aswetaw.issuemanager.request.dto.DepartmentDTO;
import com.aswetaw.issuemanager.request.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
public class DepartmentService extends BaseService<DepartmentDTO, Department, Long> {

    public DepartmentService(DepartmentRepository departmentRepo, DepartmentMapper departmentMapper) {
        super(departmentRepo, departmentMapper);
    }

    public void init() {
        if (jpaRepo.count() == 0) {
            Department department1 = new Department("Life Department", "This is Life Department", "lifedepartment@gmail.com", "098765432", "life department address");
            Department department2 = new Department("General Department", "This is General Department", "generaldepartment@gmail.com", "09123456789", "general department address");
            jpaRepo.saveAll(Arrays.asList(department1, department2));
        }
    }


}
